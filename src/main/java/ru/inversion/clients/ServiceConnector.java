package ru.inversion.clients;

import ru.inversion.gateclasses.classes.Result;
import ru.inversion.gateclasses.utils.DBWorker;
import ru.inversion.gateclasses.utils.ObjStringConverter;
import ru.inversion.gateclasses.utils.Prot;
import ru.inversion.gateclasses.utils.XxiConnector;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.SQLException;

public class ServiceConnector {

    public static Object outData(Object result, String inparam, Object inData, String serviceName) throws Throwable {
        Connection connection = null;
        int count = 0;
        String xxiuserId = null;
        String xxiPass = null;

        Method[] methods = inData.getClass().getDeclaredMethods();
        Method[] resultMethods = result.getClass().getDeclaredMethods();

        for (Method method : methods) {
            method.setAccessible(true);
            if (method.getName().equals("getXXIUserId")) {
                xxiuserId = (String) method.invoke(inData);
            }
            if (method.getName().equals("getXXIPass")) {
                xxiPass = (String) method.invoke(inData);
            }
        }

        while (true) {
            XxiConnector connector = new XxiConnector();
            connection = connector.logon(xxiuserId, xxiPass);

            if (count > 3) {
                if (result == null) {
                    for (Method resultMethod : resultMethods) {
                        resultMethod.setAccessible(true);
                        if (resultMethod.getName().equals("setErr")) {
                            assert false;
                            result = result.getClass().newInstance();
                            resultMethod.invoke(result, "Error run service");
                        }
                    }
                    connection.rollback();
                }
                break;
            }
            try {
                Result res = DBWorker.procCall(0, inparam, connection);
                if (res != null) {
                    String err = res.getErr();

                    if (err != null && (err.contains("ORA-6508") || err.contains("ORA-4068") || err.contains("ORA-4061") || err.contains("ORA-4065"))) {
                        throw new SQLException(null, null, 6508, new Throwable());
                    } else {
                        err = null;
                    }
                    if (err == null) {
                        result = ObjStringConverter.fillObjFromStr(result.getClass(), res.getOutParams());
                        connection.commit();
                    } else {
                        for (Method resultMethod : resultMethods) {
                            resultMethod.setAccessible(true);
                            result = result.getClass().newInstance();
                            if (resultMethod.getName().equals("setErr")) {
                                resultMethod.invoke(result, res.getErr());
                            }
                            if (resultMethod.getName().equals("setRetCode")) {
                                resultMethod.invoke(result, res.getRetCode());
                            }
                        }
                        connection.rollback();
                    }
                    break;
                } else
                    return null;
            } catch (Throwable throwable) {
                count++;
                throwable.printStackTrace();

                if (throwable instanceof SQLException) {
                    SQLException sqle = (SQLException) throwable;
                    if(sqle.getErrorCode() == 4068 || sqle.getErrorCode() == 4061 || sqle.getErrorCode() == 6508 || sqle.getErrorCode() == 4065) {
                        DBWorker.getPool().close();
                    }
                }
                Prot.writeProtocol("Error run service", throwable, serviceName);
            }finally {
                if(connection != null)
                    connection.close();
            }
        }
        return result;
    }
}

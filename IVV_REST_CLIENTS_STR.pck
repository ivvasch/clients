CREATE OR REPLACE PACKAGE EXT4_ClientsNameWS_STR IS

TYPE c_last_name0 IS TABLE OF VARCHAR2(300) INDEX BY PLS_INTEGER;

--Входящие параметры метода fio_in--
TYPE r_name_in IS RECORD (
    cv_last_name c_last_name0 /*фамилии*/,
    v_name VARCHAR2(300) /*имя*/
);
TYPE c_name_in IS TABLE OF r_name_in INDEX BY PLS_INTEGER;

--Исходящие параметры метода fio_in--
TYPE r_Clients_out IS RECORD (
    d_birthday DATE /*День рождения*/,
    v_last_name VARCHAR2(300) /*Фамилия*/,
    v_middle_name VARCHAR2(300) /*отчество*/,
    v_name VARCHAR2(300) /*Имя*/
);
TYPE c_Clients_out IS TABLE OF r_Clients_out INDEX BY PLS_INTEGER;


--Входящие функции
--Заполнение name_in
PROCEDURE initName_in(mparent VARCHAR2, cname_in IN OUT c_name_in);
--Исходящие функции
--Выгрузка Clients_out
PROCEDURE fillClients_out(mparent VARCHAR2, cClients_out IN OUT c_Clients_out, is_array BOOLEAN);
END EXT4_ClientsNameWS_STR;
/
CREATE OR REPLACE PACKAGE BODY EXT4_ClientsNameWS_STR IS
--Входящие функции
PROCEDURE initName_in(mparent VARCHAR2, cname_in IN OUT c_name_in)
IS
    o_count NUMBER DEFAULT NULL;
    cnt NUMBER;
    mparent2 VARCHAR2(300);
    nExtSys NUMBER(1);
BEGIN
mparent2 := mparent;
    IF LENGTH(mparent2) <> 0 THEN
        mparent2 := mparent2||'\';
    END IF;
    o_count := ext_2kernel.GetInParam(mparent2||'count');
    FOR i IN 1..NVL(o_count, 1) LOOP
        IF o_count IS NULL THEN
            cnt := NULL;
        ELSE
            cnt := i;
        END IF;
        FOR j IN 1..nvl(ext_2kernel.GetInParam(mparent2||'last_name'||cnt||'\count'), 0) LOOP
            cname_in(i).cv_last_name(j) := ext_2kernel.GetInParam(mparent2||'last_name'||j);
        END LOOP;
        IF ext_2kernel.GetInParam(mparent2||'name'||cnt) IS NOT NULL THEN
            cname_in(i).v_name := ext_2kernel.GetInParam(mparent2||'name'||cnt);
        END IF;
    END LOOP;
END;
--Исходящие функции
PROCEDURE fillClients_out(mparent VARCHAR2, cClients_out IN OUT c_Clients_out, is_array BOOLEAN)
IS
    cnt NUMBER;
    mparent2 VARCHAR2(300);
    nExtSys NUMBER(1);
BEGIN
    mparent2 := mparent;
    IF LENGTH(mparent2) <> 0 THEN
        mparent2 := mparent2||'\';
    END IF;
    IF cClients_out IS NOT NULL AND cClients_out.COUNT <> 0 THEN
        FOR i IN 1..cClients_out.COUNT LOOP
            IF is_array = FALSE THEN
                cnt := NULL;
            ELSE
                ext_2kernel.SetOutParam(mparent2||'count', cClients_out.COUNT);
                cnt := i;
            END IF;
            IF cClients_out(i).d_birthday IS NOT NULL THEN
                ext_2kernel.SetOutParam(mparent2||'birthday'||cnt, ext_2kernel.Date2Char(nExtSys, cClients_out(i).d_birthday));
            END IF;
            IF cClients_out(i).v_last_name IS NOT NULL THEN
                ext_2kernel.SetOutParam(mparent2||'last_name'||cnt, cClients_out(i).v_last_name);
            END IF;
            IF cClients_out(i).v_middle_name IS NOT NULL THEN
                ext_2kernel.SetOutParam(mparent2||'middle_name'||cnt, cClients_out(i).v_middle_name);
            END IF;
            IF cClients_out(i).v_name IS NOT NULL THEN
                ext_2kernel.SetOutParam(mparent2||'name'||cnt, cClients_out(i).v_name);
            END IF;
        END LOOP;
    END IF;
END;

END EXT4_ClientsNameWS_STR;
/

import ru.inversion.clients.ClientsWS;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("rest")
public class App extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resultset = new HashSet<Class<?>>();
        resultset.add(ClientsWS.class);
        return resultset;
    }

    @Override
    public Set<Object> getSingletons() {
        Set<Class<?>> singleset = new HashSet<Class<?>>();
        return (Set) Collections.unmodifiableSet(singleset);
    }

}

package application;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import service.TransactionService;

@ApplicationPath("/rest")
public class RestAPI extends Application {
    private Set< Object > singletons = new HashSet< Object >();

    public RestAPI() throws ClassNotFoundException, SQLException{
        this.singletons.add( new TransactionService() );
        System.out.println("Hello!");
    }

    @Override
    public Set<Object> getSingletons() {
        return this.singletons;
    }

}

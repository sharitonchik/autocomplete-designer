package by.mgvrk.util;

import org.hsqldb.Server;

import java.io.PrintWriter;

/**
 * User: sharitonchik
 */
public class HsqlServer {
    Server server;

    public HsqlServer() {
        server = new Server();
        server.setAddress("localhost");
        server.setDatabaseName(0,"testdb");
        server.setDatabasePath(0,"file:/home/sharitonchik/IdeaProjects/autocomplete-designer/hsqldb/testdb");
        server.setPort(1234);
        server.setTrace(true);
        server.setLogWriter(new PrintWriter(System.out));
    }

    public void startServer(){
        server.start();
    }
    public void stopServer(){
        server.shutdown();
    }
}

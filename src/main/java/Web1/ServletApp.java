package Web1;

import Web1.HelloServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class ServletApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(HelloServlet.class,"/helloo");
        server.setHandler(handler);
        server.start();
        server.join();
    }
}

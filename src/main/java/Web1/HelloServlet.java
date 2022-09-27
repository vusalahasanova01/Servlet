package Web1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    /* http://localhost:8080/helloo */
   /* http://localhost:8080/helloo?x=5&y=167*/
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String xs = req.getParameter("x");
      String ys = req.getParameter("y");
     // String zs = req.getParameter("z");
      int x = Integer.parseInt(xs);
      int y = Integer.parseInt(ys);
      int z = x + y;

       try(PrintWriter writer = resp.getWriter()){
           writer.printf("%d,%d is given and sum is %d ",x,y,z);
       }
        /* PrintWriter writer = resp.getWriter();
        writer.println("Hello java!");
        writer.close();
        */
    }
}

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloWeb extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello, Web!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}

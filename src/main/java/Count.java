import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet("/count")
public class Count extends HttpServlet {

    private int hitCount;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        hitCount++;

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Page Count View</h1>");
        out.println("<h2>The page has been viewed: " + hitCount + " times.</h2>");
    }
}

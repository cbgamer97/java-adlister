import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.Integer.parseInt;

@WebServlet("/guess")
public class GuessServlet extends HttpServlet {

//    double rightChoice = Math.floor(Math.random() * 3);
    int rightChoice = 1;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("guessing.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userChoice = req.getParameter("number");
        int userInt = parseInt(userChoice);
        if(userInt == rightChoice){
            resp.sendRedirect("/correct");
        } else if (userInt != rightChoice){
            resp.sendRedirect("/incorrect");
        }
    }
}

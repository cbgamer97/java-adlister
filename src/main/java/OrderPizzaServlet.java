import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/pizza-order")
public class OrderPizzaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("pizza-order.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String crust = req.getParameter("crust");
        String sauces = req.getParameter("sauce");
        String sizes = req.getParameter("size");
        String[] toppings = req.getParameterValues("topping");
        String address = req.getParameter("address");

        System.out.println(crust + ' ' + sauces + ' ' + sizes);
        for(String topping : toppings){
            System.out.println(topping);
        }
        System.out.println(address);
        req.getRequestDispatcher("pizza-order.jsp").forward(req, resp);
    }
}

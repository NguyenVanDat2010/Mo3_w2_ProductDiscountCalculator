import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet",urlPatterns = "/product")
public class ProductDiscountCalculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String discountDescription = request.getParameter("description");
        float listPrice = Float.parseFloat(request.getParameter("price"));
        float discountPercent = Float.parseFloat(request.getParameter("percent"));

        float discountAmount = listPrice * discountPercent * 0.01f;
        float discountPrice = listPrice - discountAmount;

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<h3>Product description: " + discountDescription + "</h3>");
        writer.println("<h3>Discount Amount: " + discountAmount + "</h3>");
        writer.println("<h3>Discount Price: " + discountPrice + "</h3>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

package pl.sda.servlets.second;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/serverRedirect")
public class ServerRedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");

        RequestDispatcher requestDispatcher = request
                .getRequestDispatcher("/redirects");

        Random random = new Random();
        if(random.nextInt() % 2 == 0){
            writer.println("<h1>Forward</h1>");
            requestDispatcher.forward(request, response);
        } else {
            writer.println("<h1>Include</h1>");
            requestDispatcher.include(request, response);
        }
    }
}

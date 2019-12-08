package pl.sda.servlets.sixth;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/postServlet")
public class PostServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();

        writer.println("Imię: " + request.getParameter("name"));
        writer.println("Nazwisko: " + request.getParameter("surname"));
        writer.println("Wiek: " + request.getParameter("age"));
    }










//todo after 405 - Method Not Allowed
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();

        writer.println("Nie obsługuje getów");
        request.getRequestDispatcher("/getServlet").include(request, response);
    }
}

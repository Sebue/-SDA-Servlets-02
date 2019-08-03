package pl.sda.servlets.third;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static pl.sda.servlets.third.HelloFilter.USER;

@WebServlet("/filter")
public class FilterServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter writer = response.getWriter();
        String user = (String) request.getAttribute(USER);
        writer.println("<h1>Witaj " + user + "!</h1><br>");
    }
}

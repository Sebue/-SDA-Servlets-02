package pl.sda.servlets.forth;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/jsp")
public class JSPHelloWorld extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");
        writer.println("<h1>Servlet JSP</h1><hr>");

        request.getRequestDispatcher("/JspHelloWorld.jsp")
                .include(request, response);
    }
}
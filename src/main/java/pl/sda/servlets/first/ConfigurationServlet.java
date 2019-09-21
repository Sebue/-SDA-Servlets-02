package pl.sda.servlets.first;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet",
        urlPatterns = {"/hello", "/hi", "/Hello"},
        initParams = {@WebInitParam(name = "who", value = "World"),
                @WebInitParam(name = "times", value = "5")},
        loadOnStartup = 1)
public class ConfigurationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {
        String who = request.getParameter("who");
        String whoInit = this.getInitParameter("who");
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");
        writer.println("<h2>Hello, " + who + "</h2><br>");
        writer.println("<h2>Hello, " + whoInit + " (from init param)</h2>");
    }
}

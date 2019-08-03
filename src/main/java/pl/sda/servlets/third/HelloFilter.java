package pl.sda.servlets.third;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebFilter(filterName = "HelloFilter", urlPatterns = {"/filter"})
public class HelloFilter implements Filter {

    public static final String USER = "user";

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //todo before
        servletResponse.setCharacterEncoding("UTF-8");
        servletResponse.setContentType("text/html");
        Map<String, String[]> parameterMap = servletRequest.getParameterMap();
        if(parameterMap.containsKey(USER)){
            servletRequest.setAttribute(USER, parameterMap.get(USER)[0]);
        } else {
            servletRequest.setAttribute(USER, "Unknown");
        }

        //servlet execution
        filterChain.doFilter(servletRequest, servletResponse);

        //todo after
        PrintWriter writer = servletResponse.getWriter();
        String userName = (String) servletRequest.getAttribute(USER);
        if(userName.matches(".+a")){
            writer.println("<br><h1>Jesteś kobietą!</h1><br>");
        } else {
            writer.println("<br><h1>Jesteś facetem!</h1><br>");
        }
    }
}

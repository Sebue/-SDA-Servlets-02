package pl.sda.servlets.third;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Map;

@WebFilter(filterName = "HelloFilter", urlPatterns = {"/filter"})
public class HelloFilter implements Filter {

    public static final String USER = "user";

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //todo before
        Map<String, String[]> parameterMap = servletRequest.getParameterMap();
        if(parameterMap.containsKey(USER)){
            servletRequest.setAttribute(USER, parameterMap.get(USER).toString());
        } else {
            servletRequest.setAttribute(USER, "Unknown");
        }

        filterChain.doFilter(servletRequest, servletResponse);

        //todo after
    }
}

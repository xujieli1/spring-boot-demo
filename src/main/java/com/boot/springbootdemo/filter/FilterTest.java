package com.boot.springbootdemo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author : jieli.xu
 * @date : 2022/6/19
 */
@WebFilter(urlPatterns = "/*" ,filterName = "myFilter")
public class FilterTest implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(">>>>>>run doFilter");
        if(null != servletRequest.getParameter("useFilter")){
            String info = servletRequest.getParameter("useFilter");
            servletResponse.getWriter().write(">>>>>useFilter");
        }else{
            filterChain.doFilter(servletRequest,servletResponse);
        }

    }
}

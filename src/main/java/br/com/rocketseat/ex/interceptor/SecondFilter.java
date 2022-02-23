package br.com.rocketseat.ex.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

public class SecondFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(SecondFilter.class);


    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("doFilter() method is invoked for second filter");
        chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {
        logger.info("init() method has been get invoked second filter");
    }
    public void destroy() {
        //do some stuff like clearing the resources
    }

}

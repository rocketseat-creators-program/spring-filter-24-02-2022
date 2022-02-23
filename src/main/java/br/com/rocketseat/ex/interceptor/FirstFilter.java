package br.com.rocketseat.ex.interceptor;

import java.io.IOException;

import javax.servlet.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(FirstFilter.class);


    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("doFilter() method is invoked first filter");
        chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {
        logger.info("init() method has been get invoked first filter");
    }
    public void destroy() {
        //do some stuff like clearing the resources
    }
}

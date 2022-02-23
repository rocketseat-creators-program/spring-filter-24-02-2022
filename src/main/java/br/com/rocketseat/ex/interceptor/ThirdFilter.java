package br.com.rocketseat.ex.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

public class ThirdFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(ThirdFilter.class);

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.error("doFilter() method is invoked for third filter");
        logger.error(request.getServerName());
        logger.error(request.getProtocol());
        logger.error(request.getLocalAddr());
        logger.error(request.getRemoteHost());
        logger.error(request.getParameterMap().toString());
        chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {
        logger.info("init() method has been get invoked third filter");
    }
    public void destroy() {
        //do some stuff like clearing the resources
    }
}

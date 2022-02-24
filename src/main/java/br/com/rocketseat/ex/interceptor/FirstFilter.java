package br.com.rocketseat.ex.interceptor;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;

@RequiredArgsConstructor
public class FirstFilter implements Filter {

    private final RateLimiter rateLimiter;

    private Logger logger = LoggerFactory.getLogger(FirstFilter.class);


    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("doFilter() method is invoked first filter");
        HttpServletRequest req = (HttpServletRequest) request;
        boolean valid = rateLimiter.validate(req.getRequestURI(), 2);
        if(!valid) {
            ((HttpServletResponse) response).setStatus(429);
            response.getOutputStream().write("Too Many Requests".getBytes());
            return;
        }
        chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {
        logger.info("init() method has been get invoked first filter");
    }
    public void destroy() {
        //do some stuff like clearing the resources
    }
}

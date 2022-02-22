package br.com.rocketseat.ex.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class GeneralInterceptor implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger(GeneralInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("preHandle");

        System.out.println("Pre handle method has been called");
        System.out.println("User IP address: "  );
        System.out.println("Request Params: " );
        System.out.println("Request Payload: " );
        System.out.println("Exiting Pre handle method");
        return true;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("postHandle");
        System.out.println("Post handle method has been called");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("afterCompletion");
        System.out.println("After Completion method has been called");
    }

}
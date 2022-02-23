package br.com.rocketseat.ex.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class GeneralInterceptor implements HandlerInterceptor {

    @Autowired
    MyComponent myComponent;

    private Logger logger = LoggerFactory.getLogger(GeneralInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        logger.info("Request URL::" + request.getRequestURL().toString() + ":: Start Time=" + System.currentTimeMillis());
        request.setAttribute("startTime", startTime);

        if (request.getHeader("Authorization") == null){
            logger.info("Authorization não enviado.");
            logger.info("Validação NOK.");
            return false;
        }
        else if (request.getHeader("Authorization").equals("Teste")) {
            logger.info("Validação OK.");
            return true;
        } else {
            logger.info("Validação NOK.");
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("Post handle method has been called");
        logger.info("Request URL::" + request.getRequestURL().toString() + " Sent to Handler :: Current Time=" + System.currentTimeMillis());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        long startTime = (Long) request.getAttribute("startTime");
        logger.info("Request URL::" + request.getRequestURL().toString() + ":: End Time=" + System.currentTimeMillis());
        logger.info("Request URL::" + request.getRequestURL().toString() + ":: Time Taken=" + (System.currentTimeMillis() - startTime));
    }

}
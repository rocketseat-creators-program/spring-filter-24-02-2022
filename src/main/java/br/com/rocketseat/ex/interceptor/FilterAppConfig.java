package br.com.rocketseat.ex.interceptor;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterAppConfig {

    @Bean
    public FilterRegistrationBean<GeneralFilter > filterRegistrationBean() {
        FilterRegistrationBean <GeneralFilter> registrationBean = new FilterRegistrationBean();
        GeneralFilter customURLFilter = new GeneralFilter();

        registrationBean.setFilter(customURLFilter);
        // registrationBean.addUrlPatterns("/greeting/*");
        registrationBean.setOrder(2); //set precedence
        return registrationBean;
    }

}

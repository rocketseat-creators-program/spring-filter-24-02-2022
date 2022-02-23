package br.com.rocketseat.ex.interceptor;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterAppConfig {

    @Bean
    public FilterRegistrationBean<FirstFilter> registerFirstFilter() {
        FilterRegistrationBean <FirstFilter> registrationBean = new FilterRegistrationBean();
        FirstFilter customURLFilter = new FirstFilter();

        registrationBean.setFilter(customURLFilter);
        // registrationBean.addUrlPatterns("/greeting/*");
        registrationBean.setOrder(1); //set precedence
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<SecondFilter> registerSecondFilter() {
        FilterRegistrationBean <SecondFilter> registrationBean = new FilterRegistrationBean();
        SecondFilter secondFilter = new SecondFilter();

        registrationBean.setFilter(secondFilter);
        // registrationBean.addUrlPatterns("/greeting/*");
        registrationBean.setOrder(2); //set precedence
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<ThirdFilter> registerThirdFilter() {
        FilterRegistrationBean <ThirdFilter> registrationBean = new FilterRegistrationBean();
        ThirdFilter thirdFilter = new ThirdFilter();

        registrationBean.setFilter(thirdFilter);
        // registrationBean.addUrlPatterns("/greeting/*");
        registrationBean.setOrder(3); //set precedence
        return registrationBean;
    }

}

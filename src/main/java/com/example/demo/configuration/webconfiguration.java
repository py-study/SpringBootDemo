package com.example.demo.configuration;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


@Configuration
public class webconfiguration {

    @Bean
    public RemoteIpFilter remoteIpFilter(){
        return new RemoteIpFilter();
    }

    @Bean
    public FilterRegistrationBean testFilterRegistration(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new MyFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.addInitParameter("paramName","paramValue");
        registrationBean.setName("Myfilter");
        registrationBean.setOrder(1);
        System.out.println("sdfsf");
        return registrationBean;
    }

    public class MyFilter implements Filter {
        @Override
        public void destroy(){

        }

        @Override
        public void doFilter(ServletRequest srequest, ServletResponse sresponse,
                             FilterChain filterChain) throws IOException, ServletException {
            HttpServletRequest request = (HttpServletRequest) srequest;
            System.out.println("this is Myfilter, url :" + request.getRequestURI());
            if(request.getRequestURI() .equals("/f1")){
                filterChain.doFilter(srequest,sresponse);
            }else {
                System.out.println("this is Myfilter, url : error");
            }
        }

        @Override
        public  void init(FilterConfig arg0){
            System.out.println("dfafwfw");
        }

    }
}

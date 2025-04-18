package com.is.authservice.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


import com.is.authservice.interceptor.AppInterceptor;

@Component
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Autowired
    AppInterceptor appInterceptor;

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(appInterceptor);
    }
}

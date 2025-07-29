package com.dbs.annotationspringapp;

import com.dbs.annotationspringapp.service.EmailServerConfig;
import com.dbs.annotationspringapp.service.EmailService;
import com.dbs.annotationspringapp.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;

@Configuration
public class SpringConfig {
    @Bean
    public EmailServerConfig emailServerConfig(){
        EmailServerConfig ec = new EmailServerConfig();
        ec.setServerid("192.168.12.1");
        ec.setAuthtoken("VVFFT%123");
        return ec;
    }
    @Bean
    public EmailService emailService(){
        EmailService es = new EmailService(emailServerConfig());
        return  es;
    }
    @Bean
    @Scope("singleton")
    public OrderService orderService(){
        OrderService os = new OrderService(emailService());
        return os;
    }

}

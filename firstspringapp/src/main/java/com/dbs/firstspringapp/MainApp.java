package com.dbs.firstspringapp;

import com.dbs.firstspringapp.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container =
                new ClassPathXmlApplicationContext("spring-config.xml");
        OrderService os = (OrderService)container.getBean("orderService");
        os.placeOrder();
    }
}

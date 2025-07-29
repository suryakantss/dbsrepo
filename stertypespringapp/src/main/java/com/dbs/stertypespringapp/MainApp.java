package com.dbs.stertypespringapp;
import com.dbs.stertypespringapp.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        OrderService os1 = (OrderService)container.getBean("orderService");
        System.out.println(os1);
        os1.placeOrder();
        //===================
        OrderService os2 = (OrderService)container.getBean("orderService");
        System.out.println(os2);
        os2.placeOrder();

    }
}

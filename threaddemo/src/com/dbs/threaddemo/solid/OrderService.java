package com.dbs.threaddemo.solid;

public class OrderService {
   // has a
    private  EmailService es;
    public void placeOrder(){
        System.out.println("Order Placed...");
        es.sendMail("128.9.8.1");
    }



}

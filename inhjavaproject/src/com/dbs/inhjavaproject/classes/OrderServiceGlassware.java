package com.dbs.inhjavaproject.classes;

public class OrderServiceGlassware extends AbstractOrderService {
    public void placeOrder(){
        System.out.println("Order placed");
        System.out.println("fragile....handle with care");
    }
    @Override
    public  void cancelOrder(){
        System.out.println("Order cancelled (glass)");
    }

}

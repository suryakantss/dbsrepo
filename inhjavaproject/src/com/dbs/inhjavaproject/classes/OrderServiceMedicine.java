package com.dbs.inhjavaproject.classes;

public class OrderServiceMedicine extends AbstractOrderService {
    public void placeOrder(){
        System.out.println("Order placed");
        System.out.println("Please main. req. temperature..");
    }
    @Override
    public  void cancelOrder(){
        System.out.println("Order cancelled (Med)");
    }

}

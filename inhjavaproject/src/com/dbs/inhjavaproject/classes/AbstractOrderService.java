package com.dbs.inhjavaproject.classes;

public abstract class AbstractOrderService {
    public void placeOrder(){
        System.out.println("Order Placed...");
    }
    public abstract void cancelOrder();


}

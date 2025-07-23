package com.dbs.inhjavaproject.classes;

public class OrderServiceMain {

    public static void main(String[] args) {

      AbstractOrderService os;
      os = new OrderServiceGlassware();
       // os = new OrderServiceMedicine();
       os.placeOrder();
       os.cancelOrder();


    }
}

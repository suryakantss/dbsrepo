package com.dbs.inhjavaproject;
class CartService {
  public void addToCart(){
      System.out.println("Added");
  }
    public void removeFromCart(){
        System.out.println("Removed...");
    }
}
class NewcartService extends  CartService {
    public  void saveCart(){
        System.out.println("Saved...");

    }


}


public class Main3 {
    public static void main(String[] args) {

        NewcartService ncs = new NewcartService();
        ncs.addToCart();
        ncs.addToCart();
        ncs.saveCart();
    }
}

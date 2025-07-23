package com.dbs.inhjavaproject.interfaces;

import com.dbs.inhjavaproject.classes.OrderServiceGlassware;

class Animal {

}

interface Pet {

}

interface  Playable {

}

class Dog extends Animal implements Pet,Playable {

}
class Tiger extends Animal{

}

abstract class OrderService {
    abstract void placeOrder();

}
interface Cancellable {
    public void cancelOrder();
}

class MedicineOrderService extends OrderService{
    @Override
    void placeOrder() {

    }
}
class GlasswareOrderService extends  OrderService implements  Cancellable{
    @Override
    void placeOrder() {
    }

    @Override
    public void cancelOrder() {

    }
}


public class Multi {
    public static void main(String[] args) {

        Animal a ;
        a = new Dog();
    }
}

package com.dbs.inhjavaproject;

abstract class Payment {
    double amount;
}
abstract class UPI extends  Payment {
    String upiid;
}
class Gpay extends  UPI {
    String cashback="1";
}
class CreditCard extends  Payment {
    String ccno;
}



public class Main4 {

    public static void main(String[] args) {

        Gpay upi = new Gpay();
        upi.amount=1000;
        upi.upiid="xyz@ybl";
        CreditCard cc = new CreditCard();
        cc.amount=10000;
        cc.ccno="CVFGRT";

       }
}

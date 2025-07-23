package com.dbs.inhjavaproject;
abstract class Loan {
    public int  getInterest(){
       return 5;
    }
}
class HomeLoan extends  Loan {
  @Override
    public  int getInterest(){
      return  super.getInterest()+4;
  }
}
class CarLoan extends  Loan {
    @Override
    public int getInterest() {
        return super.getInterest()+2;
    }
}

public class Main2 {

    public static void main(String[] args) {
        HomeLoan hm = new HomeLoan();
        System.out.println(hm.getInterest());

        CarLoan cl = new CarLoan();
        System.out.println(cl.getInterest());



    }
}

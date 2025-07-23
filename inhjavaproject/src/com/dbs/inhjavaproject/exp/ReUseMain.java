package com.dbs.inhjavaproject.exp;

public class ReUseMain {
    public static void main(String[] args) {
        try {
            System.out.println(add(-10, 20));
        }catch (NegativeNoException e){
            System.out.println(e.getMessage());
        }
    }

    public static  int add(int a, int b){
        if(a < 0 || b < 0)
           // throw  new ArithmeticException("Neg.# not allowed : "+ a + "," + b);
            throw  new NegativeNoException("Neg.# not allowed : "+ a + "," + b);

        else
            return a+b;
    }
}

package com.dbs.inhjavaproject.exp;

public class CalcMain {

    public static void main(String[] args) {

        try {
            Calculator calc = new Calculator();
            System.out.println(calc.add(10, -20));
        } catch (InvalidNoException e){
            System.out.println(e.getMessage());
        }
    }
}

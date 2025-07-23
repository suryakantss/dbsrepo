package com.dbs.inhjavaproject.exp;

public class Calculator {
    public int add(int a , int b) throws InvalidNoException{
        if(a < 0 || b < 0)
            throw new InvalidNoException("Invalid "+ a +","+b);
        return  a+b;
    }
}

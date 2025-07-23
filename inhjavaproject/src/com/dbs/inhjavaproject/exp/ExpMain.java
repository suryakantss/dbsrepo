package com.dbs.inhjavaproject.exp;

public class ExpMain {
    public static void main(String[] args) {

        try {
            int x = 10 / 0;
            int arr[] = {10,20,30};
            System.out.println(arr[1]);
            System.out.println(x);
        }catch (ArithmeticException e){
            int count = 100/2;
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Done!!!!");
        }

    }
}

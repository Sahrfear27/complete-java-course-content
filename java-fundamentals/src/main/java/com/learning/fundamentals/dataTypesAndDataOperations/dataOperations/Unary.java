package com.learning.fundamentals.dataTypesAndDataOperations.dataOperations;

public class Unary {
    /*UNARY OPERATORS*/
    int count = 5;
    public void displayUnary(){
        count++;
        System.out.println("After Increment, count is now: " + count);

        count --;
        System.out.println("After Decrement, count is now: " + count);
    }
}

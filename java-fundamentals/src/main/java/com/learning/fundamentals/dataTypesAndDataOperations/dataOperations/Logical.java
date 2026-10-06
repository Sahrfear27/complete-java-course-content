package com.learning.fundamentals.dataTypesAndDataOperations.dataOperations;

public class Logical {
    /*LOGICAL  OPERATORS*/
    boolean hasAccount = true;
    boolean hasPassword = true;
    public void displayLogical(){
        System.out.println(hasAccount && hasPassword);
        System.out.println(hasAccount || hasPassword);
        System.out.println(!hasAccount);
    }
}

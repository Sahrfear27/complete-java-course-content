package com.learning.fundamentals.dataTypesAndDataOperations.primitive;

public class PrimitiveData {
    // =========================
    // 1. PRIMITIVE DATA TYPES
    // =========================
    public void displayPrimitiveDataType(){
        /*Integers*/
        byte age = 30;
        short year = 2026;
        int salary = 160000;
        long population = 8_000_000_000L;

        /*float*/
        float temperature = 98.6F;
        double price = 99.94;

        /*characters*/
        char score = 'A';

        /*Boolean*/
        boolean isLogin = true;
        System.out.println("Age:"+ age);
        System.out.println("Year:"+ year);
        System.out.println("Salary:"+ salary);
        System.out.println("Temperature:"+ temperature);
        System.out.println("Price:"+ price);
        System.out.println("Score:"+ score);
        System.out.println("Is this user currently logged in? "+ isLogin);
    }
}

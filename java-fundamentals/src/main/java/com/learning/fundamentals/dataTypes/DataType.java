package com.learning.fundamentals.dataTypes;

public class DataType {
    // =========================
    // 1. PRIMITIVE DATA TYPES
    // =========================
   public void primitiveDataType(){
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

    // =========================
    // 2.Non PRIMITIVE DATA TYPES
    // =========================
    public void nonprimitiveDataType(){
       /*String*/
        String name = "Sahrfear Macarthy";
        String message = "Welcome to Capital One";
        System.out.println("Hello "+ name + ", " + message);

        /*Classes*/
        Car car1 = new Car("Nissan", 2025);
        Car car2 = new Car("Toyota", 2021);
        car1.display();
        car2.display();

        /*Arrays*/
        int [] numbers = {1,2,3,4,5};
        String[] fruits = {"Apple", "Mango", "Grapes"};

        System.out.println("First Number:" + " " + numbers[0]);
        System.out.println("First Fruit:" + " " + fruits[0]);
    }
}

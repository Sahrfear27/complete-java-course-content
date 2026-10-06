package com.learning.fundamentals.dataTypesAndDataOperations.nonPrimitive;

public class NonPrimitive {
    // =========================
    // 2.Non PRIMITIVE DATA TYPES
    // =========================
    public void displayNonprimitiveDataType(){
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

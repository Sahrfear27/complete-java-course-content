package com.learning.fundamentals.dataTypes;

public class Car {
    String model;
    int year;
    Car(String model, int year){
        this.model = model;
        this.year = year;
    }
    void display(){
        System.out.println(model + " " + year);
    }
}

package com.learning.fundamentals;

import com.learning.fundamentals.dataTypesAndDataOperations.dataOperations.Arithmetic;
import com.learning.fundamentals.dataTypesAndDataOperations.dataOperations.Logical;
import com.learning.fundamentals.dataTypesAndDataOperations.dataOperations.Relational;
import com.learning.fundamentals.dataTypesAndDataOperations.dataOperations.Unary;
import com.learning.fundamentals.dataTypesAndDataOperations.nonPrimitive.NonPrimitive;
import com.learning.fundamentals.dataTypesAndDataOperations.primitive.PrimitiveData;

public class Main {

    public static void main(String[] args) {

        // ==================================================
        // DATA TYPES
        // ==================================================

        // Primitive Data Types
        System.out.println("===== PRIMITIVE DATA TYPES =====");
        PrimitiveData primitiveData = new PrimitiveData();
        primitiveData.displayPrimitiveDataType();


        // Non-Primitive Data Types
        System.out.println("\n===== NON-PRIMITIVE DATA TYPES =====");
        NonPrimitive nonPrimitive = new NonPrimitive();
        nonPrimitive.displayNonprimitiveDataType();


        // ==================================================
        // DATA OPERATIONS
        // ==================================================

        // Arithmetic Operators
        System.out.println("\n===== ARITHMETIC OPERATORS =====");

        Arithmetic arithmetic = new Arithmetic();
        arithmetic.displayArithmeticOps();


        // Logical Operators
        System.out.println("\n===== LOGICAL OPERATORS =====");

        Logical logical = new Logical();
        logical.displayLogical();


        // Relational Operators
        System.out.println("\n===== RELATIONAL OPERATORS =====");

        Relational relational = new Relational();
        relational.displayRelational();


        // Unary Operators
        System.out.println("\n===== UNARY OPERATORS =====");

        Unary unary = new Unary();
        unary.displayUnary();


        // ==================================================
        // END
        // ==================================================

        System.out.println("\n===== END OF DATA TYPES & OPERATIONS =====");
    }
}
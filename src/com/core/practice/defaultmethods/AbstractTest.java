package com.core.practice.defaultmethods;

abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("We can create Constructor in Abstract Class.");
    }

    abstract int add(int a, int b); // abstract method

    int subtract(int a, int b){ //non abstract method
        return a - b;
    }

    static int multiply(int a, int b) {  // static method
        return a * b;
    }
}

public class AbstractTest extends AbstractClass {

    @Override
    int add(int a, int b) { // implementing abstract methods
        return a + b;
    }

    public static void main(String[] args) {
        AbstractTest a = new AbstractTest();
        int result1 = a.add(10, 20); // calling abstract method
        int result2 = a.subtract(50, 40); // calling non abstract method
        int result3 = AbstractClass.multiply( 10, 20); // calling static method
        System.out.println("Addition: " + result1);
        System.out.println("Subtraction: " + result2);
        System.out.println("Multiplication: " + result3);
    }
}

package com.practice.core;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Hi h = new Bye();
        h.subtract();
        h.sum();

    }
}

class Hi {
    void sum(){
        System.out.println("Sum from Hi class");
    }
    void subtract(){

    }
}

class Bye extends Hi{
    @Override
    void sum() {
        System.out.println("Sum from Bye class");
    }
    void multiply(){

    }
}

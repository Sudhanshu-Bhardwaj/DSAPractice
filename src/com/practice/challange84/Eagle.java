package com.practice.challange84;

public class Eagle extends Bird{
    public Eagle() {
        super("Eagle");
    }

    @Override
    public void fly() {
        System.out.println("Eagle flies above the cloud when it rains!!!");
    }
}

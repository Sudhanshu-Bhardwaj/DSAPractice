package com.practice.challange96;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Printing all the day of the week : ");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}

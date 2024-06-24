package com.practice.lecturepractice.equals;

public class EqualsAndHashcodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Sudhanshu", 26, "SUD20");
        Person person2 = new Person("Sudhanshu", 26 , "SUD20");

        if (person1.equals(person2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}

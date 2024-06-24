package com.core.practice;

public class Lab443 {
    public static void main(String[] args) {
        showClassInfo("JLC");
        Student stu = new Student();
        showClassInfo(stu);
        Object obj = new Object();
        showClassInfo(obj);
    }

    static void showClassInfo(Object obj) {
        Class cls = obj.getClass();
        System.out.println("Class Name: " + cls.getName());
        Class scls = cls.getSuperclass();
        if (scls != null) {
            System.out.println("Super Class: " + scls.getName());
        } else
            System.out.println("No Super Class");
    }
}

class Person{}

class Student extends Person{}

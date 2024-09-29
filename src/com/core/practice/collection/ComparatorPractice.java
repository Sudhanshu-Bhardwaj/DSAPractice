package com.core.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorPractice {
    private int id;
    private String name;

    public ComparatorPractice(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String toString(int id, String name) {
        return "Student{name='" + name + "', id=" + id + '}';
    }

    public static void main(String[] args) {
        List<ComparatorPractice> students = new ArrayList<>();
        students.add(new ComparatorPractice(5, "Sudhanshu"));
        students.add(new ComparatorPractice(3, "Aryan"));
        students.add(new ComparatorPractice(2, "Himanshu"));
        students.add(new ComparatorPractice(4, "Ritesh"));
        students.add(new ComparatorPractice(1, "Puja"));

        //sorting by name using comparator
        Collections.sort(students, new Comparator<ComparatorPractice>() {
            @Override
            public int compare(ComparatorPractice s1, ComparatorPractice s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        System.out.println("Sorted by name : ");
        for (ComparatorPractice student : students) {

        }
    }
}

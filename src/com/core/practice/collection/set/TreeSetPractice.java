package com.core.practice.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>();
        set.add("Apple");     set.add("Orange");
        set.add("Mango");     set.add("Apple");
        set.add("Guava");     set.add("Grapes");
        set.add("Mango");     set.add("Kiwi");

        set.forEach(System.out::println);
    }
}

package com.core.practice.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Apple");     set.add("Orange");
        set.add("Mango");     set.add("Apple");
        set.add("Guava");     set.add("Grapes");
        set.add("Mango");     set.add("Kiwi");

        set.forEach(System.out::println);
    }
}

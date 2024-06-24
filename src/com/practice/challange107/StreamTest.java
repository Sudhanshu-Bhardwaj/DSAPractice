package com.practice.challange107;

import java.util.List;

public class   StreamTest {
    public static void main(String[] args) {
        List<String> fruitsList = List.of("Apple", "Mango", "Guava", "Grapes", "Banana");
        fruitsList.stream().
                forEach( fruits -> System.out.println(fruits));
    }
}

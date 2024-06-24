package com.core.practice.collection.list;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListPractice {
    public static void main(String[] args) {
        // Define and initialize the nested lists with proper generics
        List<String> l1 = List.of("Sudhanshu", "Bhardwaj");
        List<String> l2 = List.of("Himanshu", "Bhardwaj");
        List<List<String>> l3 = List.of(l1, l2);

        List<String> l4 = List.of("CK", "OK");
        List<String> l5 = List.of("OK", "GK");
        List<List<String>> l6 = List.of(l4, l5);

        List<List<List<String>>> l7 = List.of(l3, l6);

        // Use streams to filter the elements and collect them into a list
        List<String> element = Optional.ofNullable(l7)
                .stream()
                .flatMap(List::stream)
                .peek(innerList -> System.out.println("After first flatMap: " + innerList))
                .flatMap(List::stream)
                .peek(innerList -> System.out.println("After second flatMap: " + innerList))
                .flatMap(List::stream)
                .peek(item -> System.out.println("After third flatMap: " + item))
                .filter(e -> e.equals("Sudhanshu"))
                .peek(filteredItem -> System.out.println("After filter: " + filteredItem))
                .collect(Collectors.toList());

        // Print the filtered elements
        System.out.println("Filtered elements: " + element);
    }
}

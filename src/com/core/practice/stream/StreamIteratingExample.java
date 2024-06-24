package com.core.practice.stream;

import java.util.stream.Stream;

public class StreamIteratingExample {
    public static void main(String[] args) {
        Stream.iterate(1, element -> element + 1)
                .filter(element -> element % 5 == 0)
                .limit(10)
//                .forEach(element -> System.out.println(element));
//                               OR
                .forEach(System.out::println);
    }
}

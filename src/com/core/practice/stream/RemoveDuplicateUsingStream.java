package com.core.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateUsingStream {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "Java", "JavaScript", "C#", "C", "Rust", "Go", "Python");
//        languages.add("Swift");
        Set<String> uniqueLanguages = languages.stream().collect(Collectors.toSet());
        System.out.println(uniqueLanguages);
    }
}

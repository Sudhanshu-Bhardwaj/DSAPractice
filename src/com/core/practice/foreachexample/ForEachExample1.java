package com.core.practice.foreachexample;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample1 {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Hockey");
        gamesList.add("Cricket");
        gamesList.add("Football");
        gamesList.add("Chess");
        System.out.println("<------------------Iterating by passing lambda expression------------------>");
        gamesList.forEach(game -> System.out.println(game));
        System.out.println("<------------------Iterating by passing method reference--------------------->");
        gamesList.forEach(System.out::println);
    }
}

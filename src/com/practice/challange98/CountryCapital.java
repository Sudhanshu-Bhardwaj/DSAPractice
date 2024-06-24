package com.practice.challange98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryCapital {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India", "New Delhi");
        countryMap.put("Sri Lanka", "Colombo");
        countryMap.put("China", "Bejing");
        countryMap.put("Japan", "Tokyo");
        countryMap.put("France", "Paris");
        countryMap.put("England", "London");

        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the country name : ");
        String country = sc.next();

        if (countryMap.containsKey(country)) {
            System.out.printf("Capital of %s is %s", country,
                    countryMap.get(country));
        } else {
            System.out.print("Country not found");
        }
    }
}

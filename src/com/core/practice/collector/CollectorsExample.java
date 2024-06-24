package com.core.practice.collector;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenovo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        List<Float> productPriceList = productsList.stream()
                .map(x -> x.price)// fetching price
                .collect(Collectors.toList()); //collecting as list
        System.out.println(productPriceList);

        Set<Float> productPriceList2 = productsList.stream()
                .map(x -> x.price)// fetching price
                .collect(Collectors.toSet()); //collecting as list
        System.out.println(productPriceList2);

        Double sumPrices = productsList.stream()
                .collect(Collectors.summingDouble(x -> x.price));
        System.out.println("Sum of prices : " + sumPrices);

        Double sumId = productsList.stream()
                .collect(Collectors.summingDouble(x -> x.id));
        System.out.println("Sum of Id's : " + sumId);

        Double average = productsList.stream()
                .collect(Collectors.averagingDouble(p -> p.price));
        System.out.println("Average of product prices : " + average);

        Long noOfElements = productsList.stream()
                .collect(Collectors.counting());
        System.out.println("Total element is : " + noOfElements);
    }
}

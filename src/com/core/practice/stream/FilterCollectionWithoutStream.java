package com.core.practice.stream;

import java.util.List;
import java.util.ArrayList;

public class FilterCollectionWithoutStream {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenovo Laptop", 28000f));
        productList.add(new Product(3, "SONY Laptop", 28000f));
        productList.add(new Product(3, "Apple Laptop", 90000f));

        List<Float> productPriceList = new ArrayList<Float>();
        for (Product product : productList) {
            //filtering data of list
            if(product.price < 30000) {
                productPriceList.add(product.price); // adding price to a product price list
            }
        }
        System.out.println(productPriceList); // displaying data
    }
}

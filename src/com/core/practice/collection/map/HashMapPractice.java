package com.core.practice.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Apple", "Apple Tree");       map.put("Orange", "Guava Tree");
        map.put("Mango", "Mango Tree");       map.put("Grapes", "Grapes Tree");
        map.put("Guava", "Guava Tree");       map.put("Apple", "Apple Tree");
        map.put("Mango", "Mango Tree");       map.put("Kiwi", "Kiwi Tree");
        map.forEach((key, value) -> System.out.println(key + " " + value));
    }
}

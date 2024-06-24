package com.core.practice.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("Apple", "Apple Tree");       map.put("Orange", "Orange Tree");
        map.put("Mango", "Mango Tree");       map.put("Grapes", "Grapes Tree");
        map.put("Guava", "Guava Tree");       map.put("Apple", "Tree");
        map.put("Mango", "Tree");       map.put("Kiwi", "Kiwi Tree");
//        map.forEach((key, value) -> System.out.println(key + " " + value));
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

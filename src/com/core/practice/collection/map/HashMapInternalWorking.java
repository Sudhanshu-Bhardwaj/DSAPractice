package com.core.practice.collection.map;

import java.util.HashMap;

public class HashMapInternalWorking {
    public static void main(String[] args) {
        HashMap<String, Integer> friends = new HashMap<>();
        friends.put("Ankit", 20);
        friends.put("Uttam", 25);
        friends.put(null, 30);

        System.out.println(friends);
    }
}

package com.practice.challange93;

import com.practice.challange92.ElementSwappingInList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListReverse {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }
    public static void reverse(List<Integer> list) {
//        Collections.reverse(list);
        for (int i = 0; i < list.size() / 2; i++) {
            ElementSwappingInList.swap(list, i, list.size() - 1 - i);
        }
    }
}

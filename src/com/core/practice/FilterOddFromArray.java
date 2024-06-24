package com.core.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterOddFromArray {
    public static void main(String[] args) {
//        int[] arr = new int[]{5, 8, 7, 2, 89, 1, 6, 8};
        ArrayList al = new ArrayList();
        al.add(1);  al.add(2);
        al.add(3); al.add(4);
        al.stream().forEach(e -> System.out.println(e));
    }
}

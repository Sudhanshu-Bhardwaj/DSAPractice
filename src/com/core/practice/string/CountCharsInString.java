package com.core.practice.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();  // Use nextLine() to read the entire line

        // Create a HashMap to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Traverse the string and count the frequency of each character
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print the character frequencies
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}




//package com.core.practice.string;
//
//import java.util.Scanner;
//
//public class CountCharsInString {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        int count = 1;
//        for (int i = 1; i < s.length(); i++) {
//            if (s.charAt(i) == s.charAt(i - 1)) {
//                count++;
//            } else if (s.charAt(i) != s.charAt(i - 1)) {
//                System.out.print(count + "" + s.charAt(i - 1));
//                count = 1;
//            }
//        }
//        // Print the last character and its count
//        System.out.print(count + "" + s.charAt(s.length() - 1));
//        sc.close();
//    }
//}

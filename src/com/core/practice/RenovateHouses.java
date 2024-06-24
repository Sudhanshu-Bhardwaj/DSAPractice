package com.core.practice;

import java.util.Scanner;

public class RenovateHouses {
    public static String renovateHouses(String houses) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < houses.length(); i++) {
            char currentChar = houses.charAt(i);
            if (!(currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u' ||
                    currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U')) {
                answer.append(currentChar);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input for houses
        String houses = in.nextLine();

        String result = renovateHouses(houses);
        System.out.print(result);
    }
}

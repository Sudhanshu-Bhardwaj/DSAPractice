package com.interview;

import java.util.HashMap;
import java.util.Map;

public class StudentGradeAnalysis {
    public static String solution(String[] records) {
        // Maps to store the total grades and count of grades for each student
        Map<String, Integer> totalGrades = new HashMap<>();
        Map<String, Integer> gradeCounts = new HashMap<>();

        // Parse the input records
        for (String record : records) {
            String[] parts = record.split(" : ");
            String name = parts[0];
            int grade = Integer.parseInt(parts[1]);

            totalGrades.put(name, totalGrades.getOrDefault(name, 0) + grade);
            gradeCounts.put(name, gradeCounts.getOrDefault(name, 0) + 1);
        }

        // Find the student with the highest average grade
        String topStudent = null;
        double highestAverage = Double.MIN_VALUE;

        for (String name : totalGrades.keySet()) {
            double average = (double) totalGrades.get(name) / gradeCounts.get(name);
            if (average > highestAverage) {
                highestAverage = average;
                topStudent = name;
            }
        }

        return topStudent;
    }

    public static void main(String[] args) {
        String[] records = {"John : 5", "Michael : 4", "Ruby : 2", "Michael : 5"};
        System.out.println(solution(records));  // Output should be "John"
    }
}

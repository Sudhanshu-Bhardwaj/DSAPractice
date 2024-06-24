package com.practice.challange94;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>(){
            @Override
            public int compare(Student student, Student t1) {
                return student.getGrade() - t1.getGrade();
            }
        });
        queue.offer(new Student("Prashant", 'B'));
        queue.offer(new Student("Shyam", 'C'));
        queue.offer(new Student("Ram", 'A'));
        queue.offer(new Student("Mohan", 'D'));
        queue.offer(new Student("Sanchit", 'A'));

        System.out.printf("Queue is: %s\n", queue);
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
    }
}

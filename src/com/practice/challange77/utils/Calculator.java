package com.practice.challange77.utils;

import com.practice.challange77.geometry.Circle;
import com.practice.challange77.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10, 7);

        double cirArea = 3.14 * Math.pow(cir.radius, 2);
        double rectArea = rect.length * rect.breadth;

        System.out.printf("Area of circle is : %f , Area of rectangle is : %f", cirArea, rectArea);
    }
}

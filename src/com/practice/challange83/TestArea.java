package com.practice.challange83;

public class TestArea {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 8);
        System.out.printf("Area of Rectangle is : %f5.2 \n", rect.calculateArea());
        Circle cir = new Circle(5);
        System.out.printf("Area of Circle is : %f5.2 \n", cir.calculateArea());
        Square sq = new Square(4);
        System.out.printf("Area of Square is : %f5.2 \n", sq.calculateArea());
    }
}

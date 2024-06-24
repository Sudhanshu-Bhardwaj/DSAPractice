package com.practice.string;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String name = "Sudhanshu";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == name.charAt(i + 1)) {
                count++;
            }
        }
    }
}
/*
//interface for above example
interface Add{
    int add(int a, int b);
}
class Practice {
    public static void main(String[] args) {

        //lambda expression example
        Add a1 = (a, b) -> a + b;
        System.out.println(a1.add(10, 20));

        //Annonymous class Example
        Add ad = new Add(){
            public int add(int x, int y){
                return x + y;
            }
        };
        int sum = ad.add(10 , 20);
        System.out.println(sum);
    }
}
*/
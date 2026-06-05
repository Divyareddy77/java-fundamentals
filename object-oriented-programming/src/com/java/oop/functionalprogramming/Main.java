package com.java.oop.functionalprogramming;

public class Main {
    public static void main(String[] args) {


        /*Greet greeting = new Greet() {
            @Override
            public String greet() {
                return "Hello";
            }

            @Override
            public String greeting(String name) {
                return name + " Hello";
            }
        };
        System.out.println(greeting.greet());
        System.out.println(greeting.greet("Divya"));
*/
        Greet greeting=(name) -> name + " ,Hello, How are you";
        System.out.println(greeting.greet("Divya"));

        Calculate calculate=(price,disscountPercentage) -> price-((price*disscountPercentage)/100);
        System.out.println(calculate.finalPrice(100000,10));
    }




}

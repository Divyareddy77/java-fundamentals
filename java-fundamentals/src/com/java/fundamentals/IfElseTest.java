package com.java.fundamentals;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int number=scanner.nextInt();
        if(number%2==0){
            System.out.println(number + " is even");
        }else{
            System.out.println(number + " is odd");
        }
        int age=20;
        boolean isEligible=false;
        if(age>18) {
            isEligible = true;
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }


    }
}

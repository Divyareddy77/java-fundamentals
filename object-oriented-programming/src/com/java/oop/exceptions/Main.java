package com.java.oop.exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

            try {
                System.out.println("Enter number1");
                int num1 = scanner.nextInt();
                System.out.println("Enter number 2");
                int num2 = scanner.nextInt();
                int res = num1 / num2;
            } catch (ArithmeticException e) {
                System.out.println("Reason :" + e.getMessage());
            }
            try {
                int[] ids = new int[5];
                ids[6] = 40;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Reason :" + e.getMessage());
            }

        finally {
            System.out.println("Hello");
        }



    }
}

package com.java.fundamentals;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //printing even numbers from 1 to N
        /*Scanner scanner=new Scanner((System.in));
        System.out.println("Enter N ");
        int range=scanner.nextInt();
        int no=1;
        while(no<=range){
            if(no%2==0)
                System.out.println(no);
            no++;*/


        //do while

        char ch='Y';
        do {
            System.out.println("----------------------\n" +
                    " welocme to E-Commerce \n" +
                    "----------------------\n" +
                    "1.products\n" +
                    "2.customer\n" +
                    "3.Exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Products menu");
                    break;
                case 2:
                    System.out.println("customer menu");
                    break;
                case 3:
                    System.out.println("Exiting");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid input");

            }
            System.out.println("Do you want to continue(Y/N)");
            ch=scanner.next().charAt(0);
        } while (ch=='Y');
    }
}

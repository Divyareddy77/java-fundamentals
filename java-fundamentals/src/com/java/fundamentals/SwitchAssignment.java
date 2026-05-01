package com.java.fundamentals;

import java.util.Scanner;

public class SwitchAssignment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to E-commerce-app");
        System.out.println("\n1.Costomer\n2.Product\n3.Exit");
        System.out.println("Enter your choice ");
        int choice=scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("Welcome to customer section");
                System.out.println("1.Add customer\n2.Update customer\n3.Delete Customer");
                break;
            case 2:
                System.out.println("Welcome to Product section");
                System.out.println("1.Add Product\n2.Update Product\n3.Delete product");
                break;
            case 3:
                System.exit(0);
                break;




        }

    }
}

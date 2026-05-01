package com.java.fundamentals;

import java.util.Scanner;

public class OperatorsAssignment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter product price ");
        int productPrice=scanner.nextInt();
        System.out.println("Enter discount percentage ");
        int discountPercentage=scanner.nextInt();
        int discountAmount=productPrice*discountPercentage/100;
        int price=productPrice-discountAmount;
        System.out.println("Enter cgst");
        float cgstPercentage=scanner.nextFloat();
        float cgst=discountAmount*(cgstPercentage/100);
        System.out.println("Enter sgst");
        float sgstPercentage=scanner.nextFloat();
        float sgst=discountAmount*(sgstPercentage/100);
        float finalPrice=discountAmount+cgst+sgst;
        System.out.println("product price : "+productPrice);
        System.out.println("Discount percentage : "+discountPercentage);
        System.out.println("Dicount Amount : "+discountAmount);
        System.out.println("Price after discount : "+price);
        System.out.println("CGST"+'('+cgstPercentage+')'+':'+cgst);
        System.out.println("SGST"+'('+sgstPercentage+')'+':'+sgst);
        System.out.println("Final price :"+finalPrice);

    }
}

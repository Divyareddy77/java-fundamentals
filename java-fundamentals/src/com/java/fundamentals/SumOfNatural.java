package com.java.fundamentals;

import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter N");
        int N=scanner.nextInt();
        int no=1;
        int sum=0;
        while(no<=N){
            sum=sum+no;
            no++;
        }
        System.out.println("The sum is "+sum);
    }
}

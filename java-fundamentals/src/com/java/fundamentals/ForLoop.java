package com.java.fundamentals;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=1;i<=10; System.out.println(i)){
            i++;
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter N ");
        int number=scanner.nextInt();
        for(int no=1;no<=number;no++){
            if(no%2!=0)
                System.out.println(no);
        }
    }
}

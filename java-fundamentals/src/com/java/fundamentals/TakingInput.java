package com.java.fundamentals;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        * utility methods
        * byte-nextByte()
        * short->nextShort()
        * char->next().charAt()
        */
        System.out.println("Enter your age ");
        byte age=scanner.nextByte();


        System.out.println("Enter your total marks");
        short totalMarks=scanner.nextShort();

        System.out.println("Enter your salary");
        int salary= scanner.nextInt();

        System.out.println("Enter mobile number ");
        long mobile= scanner.nextLong();

        System.out.println("Enter percentage ");
        float percentage=scanner.nextFloat();

        System.out.println("Enter final price");
        double finalPrice=scanner.nextDouble();

        System.out.println("Enter gender");
        char gender=scanner.next().charAt(0);

        System.out.println("Enter isloggined status");
        boolean isLoggedIn=scanner.nextBoolean();


        System.out.println("Age is "+ age);
        System.out.println("Total marks are "+totalMarks);
        System.out.println("salary is "+salary);
        System.out.println("Mobile number is "+mobile);
        System.out.println("Percentage is "+percentage);
        System.out.println("Final price is "+finalPrice);
        System.out.println("Gender is "+gender);
        System.out.println("Log in status "+isLoggedIn);

    }
}

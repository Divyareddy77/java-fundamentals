package com.java.oop.exceptions;

import java.util.Scanner;

public class Transaction {
    public static void main(String[] args) {
        String name;
        int availableBalance = 30000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int amount=scanner.nextInt();
            if (amount > availableBalance) {
                throw new InsufficientFundsException("Insufficient funds");
            } else {
                System.out.println("Transaction successful");
            }
        printTransaction("Divya",amount);
    }
    static void printTransaction(String name, int amount){
        System.out.println(name + " " +amount);
    }
}

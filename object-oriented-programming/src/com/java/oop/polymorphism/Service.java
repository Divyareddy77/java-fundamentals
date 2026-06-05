package com.java.oop.polymorphism;

import com.java.oop.inheritance.Laptop;
import com.java.oop.inheritance.Product;

import java.security.PublicKey;

public class Service {
    public Product add(Product product){
        System.out.println("Service "+product);
        return product;
    }
    public Laptop add(Laptop laptop){
        System.out.println("Laptop "+ laptop);
        return laptop;
    }
    public double add(double a, double b){
        return a+b;
    }
    public boolean add(int index,Product product){
        return true;
    }
    public void displayDetails(Product product){
        product.displayDetails();
    }



}

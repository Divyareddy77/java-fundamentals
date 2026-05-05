package com.java.oop.inheritance;

public class Service {
    void validate(Product product){
        System.out.println("validating product");
    }
    /*void validate(Laptop laptop){
        System.out.println("validating laptop");
    }
    void validate(Book book){
        System.out.println("validating book");
    }
    void validate(WindowsLaptop windowsLaptop){
        System.out.println("validating windows laptop");
    }*/
    void displayDetails(Product product){
        product.displayDetails();
    }
}

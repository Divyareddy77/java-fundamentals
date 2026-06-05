package com.java.oop.polymorphism;

import com.java.oop.inheritance.Laptop;
import com.java.oop.inheritance.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"phone",100000,10,4,true);
        System.out.println(product);
        Laptop laptop = new Laptop(1,"HP",150000,15,4.5f,true,500,512,"windows");
        System.out.println(laptop);
        Service service = new Service();
        service.add(laptop);
        service.displayDetails(product);

    }

}

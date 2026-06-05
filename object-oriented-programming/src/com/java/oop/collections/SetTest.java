package com.java.oop.collections;

import java.util.HashSet;


public class SetTest {
    public static void main(String[] args) {
        HashSet<Product> hs = new HashSet<>();
        hs.add(new Product(1, "Laptop", 100000));
        hs.add(new Product(2,"phone",30000));
        hs.add(new Product(3,"AC",20000));
        hs.add(new Product(4,"TV",30000));
        hs.add(new Product(5,"AC",40000));
        hs.add(new Product(2,"phone",30000));
        hs.remove(new Product(1,"Laptop",100000));
        System.out.println(hs.contains(new Product(2,"phone",30000)));
        System.out.println(hs);
        for (Product product : hs) {
            System.out.println(product);
        }

    }
}
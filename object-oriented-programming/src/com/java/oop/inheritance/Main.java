package com.java.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        System.out.println("Id : " + product.id);
        Product product1=new Product(1,"product2",100,10,4,true);
        product.displayDetails();
        product1.displayDetails();
        Laptop laptop=new Laptop();
        System.out.println(laptop.harddiskSize);
        System.out.println(laptop.operatingSystem);
        System.out.println(laptop.ram);
        Laptop laptop1=new Laptop(1,"macbook",100000,10,4,true,500,120,"macos");
        laptop1.displayDetails();
        Book book=new Book(2,"book1",500,10,4,true,"abc",400,"xyz");
        book.displayDetails();
        WindowsLaptop windowsLaptop=new WindowsLaptop();
        Service service=new Service();
        service.validate(laptop);
        windowsLaptop.displayDetails();
        windowsLaptop.displayDetails("Amazon");
        windowsLaptop.displayDetails("Amazon",2023);
        windowsLaptop.displayDetails("apple",2026,true);
        service.displayDetails(book);
    }
}

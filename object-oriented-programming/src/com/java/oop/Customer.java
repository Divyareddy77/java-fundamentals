package com.java.oop;

public class Customer {
    int id;
    String name;
    String email;
    long phoneNumber;
    String address;
    Customer(){
        id=1;
        name="Divya";
        email="divya@gmail.com";
        phoneNumber=83757838623L;
        address="hyerabad";

    }

    public Customer(int id, String name, String email, long phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}

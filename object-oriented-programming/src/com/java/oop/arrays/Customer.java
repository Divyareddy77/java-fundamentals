package com.java.oop.arrays;

public class Customer {
    int id;
    String name;
    String email;
    long phoneNo;
    byte age;
    char gender;

    public Customer(int id, String name, String email, long phoneNo, byte age,char gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.age = age;
        this.gender=gender;
    }
    void displayCustomerDetails(){
        System.out.println("id: " +id);
        System.out.println("name :"+name);
        System.out.println("email: "+email);
        System.out.println("phone no: "+phoneNo);
        System.out.println("age :"+age);
        System.out.println("gender :"+gender);
        System.out.println("---------------");

    }
}

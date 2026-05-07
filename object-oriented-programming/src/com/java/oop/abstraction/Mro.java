package com.java.oop.abstraction;


public class Mro {
    String name;
    int money;
    Mro(String name,int money){
        this.name=name;
        this.money=money;
    }
    Certificate signCertificate(ApplicationForm form) {
        Certificate certificate = null;
        if (money > 500) {
            certificate = new Certificate(1,"Birth certificate","Divya",form.customer.name,"12-05-2025");

        }
        return certificate;
    }
        }


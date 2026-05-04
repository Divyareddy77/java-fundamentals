package com.java.oop;

public class Order {
    long id;
    String date;
    String status;
    String paymentMethod;
    int customerId;
    Order(){
        id=27864L;
        date="12-10-25";
        status="shipped";
        paymentMethod="online";
        customerId=1;
    }

    public Order(long id, String date, String status, String paymentMethod, int customerId) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.customerId = customerId;
    }
}



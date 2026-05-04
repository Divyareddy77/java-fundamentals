package com.java.oop;

public class Order {
    long id;
    String date;
    String status;
    String paymentMethod;
    int customerId;
    int totalAmount;
    boolean isPaid;
    Order(){
        id=27864L;
        date="12-10-25";
        status="shipped";
        paymentMethod="online";
        customerId=1;
        totalAmount=67678;
    }

    public Order(long id, String date, String status, String paymentMethod, int customerId) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.customerId = customerId;
        this.totalAmount=totalAmount;
    }
    int totalOrderAmount(){
        return totalAmount;
    }
    void updateOrderStatuis(){
        status="delivered";
    }
    boolean orderIspaid(){
        return isPaid;
    }
    void cancelAnOrder(String status){
        if(status !="delivered")
            status="cancelled";
    }
    void displayOrderSummary(){
        System.out.println("order id "+id);
        System.out.println("order date "+date);
        System.out.println("status "+status);
        System.out.println("Payment method "+paymentMethod);
        System.out.println("customer id "+customerId);
    }

}



package com.java.oop;

public class Payment {
    int paymentId;
    String paymentType;
    String paymentStatus;
    int paymentAmount;
    int orderAmount;
    String orderStatus;
    boolean refundStatus;
    Payment(){
        paymentId=2733;
        paymentType="Upi";
        paymentStatus="pending";
        paymentAmount=28378;
        orderAmount=3899;
        orderStatus="cancelled";
        refundStatus=false;
    }

    public Payment(int paymentId, String paymentType, String paymentStatus, int paymentAmount) {
        this.paymentId = paymentId;
        this.paymentType = paymentType;
        this.paymentStatus = paymentStatus;
        this.paymentAmount = paymentAmount;
        this.orderStatus=orderStatus;
    }
    void initiatePayment(){
        System.out.println("Payment initiated");
    }
    boolean validatePaymentAmount(int paymentAmount,int orderAmount){
        if(paymentAmount==orderAmount)
            return true;
        return false;
    }
    void processPayment(String paymentType){
        if(paymentType=="UPI" || paymentType=="CARD")
            System.out.println("Processing payment");
        System.out.println("payment pending");
    }
    void refundPayment(String orderStatus){
        if(orderStatus=="cancelled")
            refundStatus=true;
    }
    void checkPaymentStatus(){
        System.out.println("Payment status is :"+paymentStatus);
    }

}

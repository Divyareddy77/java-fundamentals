package com.java.oop;

public class PremiumCustomer extends Customer{
    String membershipType;
    int rewardPoints;

    public PremiumCustomer() {
        super();
        System.out.println("Premiuim customer constructor is called");
    }

    public PremiumCustomer(int id,String name, String email,long phoneNumber,String address,boolean isActive,String membershipType, int rewardPoints) {
        super(id,name,email,phoneNumber,address);
        this.membershipType = membershipType;
        this.rewardPoints = rewardPoints;
    }
    void displayPremiuimCustomer(){
        customerProfileDisplay();
        System.out.println("membership type :"+membershipType);
        System.out.println("reward points :"+rewardPoints);
    }
}

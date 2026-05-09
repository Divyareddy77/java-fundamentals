package com.java.oop.arrays;

public class Main {
    public static void main(String[] args) {
        int[] ids;
        ids=new int[5];
        System.out.println(ids[0]);
        ids[0]=101;
        ids[1]=102;
        ids[2]=103;
        ids[3]=104;
        ids[4]=105;
        System.out.println(ids.length);
        for(int index=0;index<ids.length;index++){
            System.out.println(ids[index]);
        }
        //for-each loop
        for(int id:ids){
            System.out.println(id);
        }
        for(int id:ids){
            id+=10000;
        }
        for(int id:ids){
            System.out.println(id);
        }
        for(int index=0;index<ids.length;index++){
            ids[index]+=10000;
        }
        for(int id:ids){
            System.out.println(id);
        }

        float[] prices={242.5f,242.5f,242.5f,242.5f,242.5f};
        for (float price:prices){
            System.out.println(price);
            char[] genders={'m','m','f','m','f'};
            for(char gender:genders)
                System.out.println(gender);
        }






    }
}

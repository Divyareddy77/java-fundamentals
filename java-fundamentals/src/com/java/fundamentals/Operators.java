package com.java.fundamentals;

public class Operators {
    public static void main(String[] args) {
        //Assignment operation
        byte age=30;
        byte castingAge;
        castingAge=age;
        System.out.println(castingAge);

        //Arithmetic operations
        byte no1=100;
        byte no2=30;
        short res;
        res= (short) (no1+no2);
        System.out.println(res);
        no1=10;
        no2=20;
        System.out.println(no1+no2);
        System.out.println(no1-no2);
        System.out.println(no1*no2);
        System.out.println(no1/no2);
        System.out.println(no1%no2);

        res=10+20-30*40/50%60;
        System.out.println(res);


        //Compound Assignment

        /*byte discountPercentage=10;
        discountPercentage= (byte) (discountPercentage+10);
        System.out.println(discountPercentage);*/
        byte discountPercentage=10;
        discountPercentage+=10;
        System.out.println(discountPercentage);


        //Relational operators(==,<,>,<=,>=)
        int no=20;
        System.out.println(no==200);


        //Logical operators(&&,||)



        //Assignment




    }
}

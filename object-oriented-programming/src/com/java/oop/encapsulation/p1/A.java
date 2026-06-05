package com.java.oop.encapsulation.p1;

import org.w3c.dom.ls.LSOutput;

public class A {
    public int var;
    //int var;
    //private int var;

    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.var);
        a.m1();
    }
    public A(){
        System.out.println("This is Constructor A");
    }
    public void m1(){
        System.out.println("This is m1 method");
    }
}

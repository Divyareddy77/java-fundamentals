package com.java.oop.interfaces;



public class Attender {
    int id;
    String name;
    int money;
    Mro mro;

    public Attender(int id, String name, int money, Mro mro) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.mro=mro;
    }
    Certificate processCertificate(ApplicationForm form){
    if(money>500)
        return mro.signCertificate(form);
    else {
        return null;

    }


    }

}

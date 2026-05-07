package com.java.oop.abstraction;

public class NormalPrintService extends  PrintService{
    @Override
    public void printService(Certificate certificate) {
        System.out.println("printing in normal");
        System.out.println("id: "+certificate.id
                +"\nname: " +certificate.name+
                "\nissued by: "+certificate.issuedBy+
                "\nissued to: "+certificate.issuedTo+
                "\nissued date :"+certificate.issuedDate);

    }
}

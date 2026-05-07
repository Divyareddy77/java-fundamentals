package com.java.oop.abstraction;

public class ColourPrintService extends PrintService{
    @Override
    public void printService(Certificate certificate) {
        System.out.println("printing in colour");
        System.out.println("id: "+certificate.id
                +"\nname: " +certificate.name+
                "\nissued by: "+certificate.issuedBy+
                "\nissued to: "+certificate.issuedTo+
                "\nissued date :"+certificate.issuedDate);

    }
}

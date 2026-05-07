package com.java.oop.interfaces;



public class CertificateServiceImpl implements CertificateService {
    Attender attender;
    PrintService printService;


    public CertificateServiceImpl(Attender attender, PrintService printService) {
        this.attender = attender;
        this.printService=printService;
    }

    @Override
    public Certificate getMyCertificate(ApplicationForm applicationForm) {
        if(authenticate("admin","admin123")){
            Certificate generatedCertificate=attender.processCertificate(applicationForm);
            printService.printCertificate(generatedCertificate);
            return  generatedCertificate;
        }else
            return null;
    }



}

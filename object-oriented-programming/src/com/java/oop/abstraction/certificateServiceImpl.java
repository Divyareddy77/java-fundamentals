package com.java.oop.abstraction;

public class certificateServiceImpl extends CertificateService{
    Attender attender;

    public certificateServiceImpl(Attender attender) {
        this.attender = attender;
    }

    @Override
    public Certificate getMyCertificate(ApplicationForm applicationForm) {
        return attender.processCertificate(applicationForm);
    }


}

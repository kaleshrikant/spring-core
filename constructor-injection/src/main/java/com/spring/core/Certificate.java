package com.spring.core;

public class Certificate {
    private String certName;

    public Certificate() {
    }

    public Certificate(String certName) {
        this.certName = certName;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "certName='" + certName + '\'' +
                '}';
    }
}

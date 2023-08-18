package com.mg.designpatterns.strategy;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ChatClient {

    private String encryptionAlgorithm;

    public ChatClient(@Value("DES") String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        if (encryptionAlgorithm.equals("DES"))
            System.out.println("Encrypting message using DES");
        else if (encryptionAlgorithm.equals("AES"))
            System.out.println("Encrypting message using AES");
        else
            throw new UnsupportedOperationException("Unsupported encryption algorithm");
        System.out.println("Sending the encrypted message...");
    }
}

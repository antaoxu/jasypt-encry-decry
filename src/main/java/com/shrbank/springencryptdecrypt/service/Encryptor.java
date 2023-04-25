package com.shrbank.springencryptdecrypt.service;

import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.stereotype.Component;

/**
 * @author 淡漠
 */
@Component
public class Encryptor {

    public String encrypt(String text,String password) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword(password);
        return encryptor.encrypt(text);
    }

    public String decrypt(String encryptedText,String password) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword(password);
        return encryptor.decrypt(encryptedText);
    }
}


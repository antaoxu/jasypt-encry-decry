package com.shrbank.springencryptdecrypt;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author 淡漠
 */
@SpringBootApplication
public class SpringEncryptDecryptApplication  {
    @Autowired
    StringEncryptor encryptor;

    public static void main(String[] args) {
        SpringApplication.run(SpringEncryptDecryptApplication.class, args);
    }
}

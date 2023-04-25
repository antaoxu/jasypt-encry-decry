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

   /* @Override
    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //System.out.println("请输入要加密的明文：");
        //String password = sc.next();
        //System.out.println(password+" 加密后的密码为："+encryptor.encrypt(password));
        System.out.println("请输入要解密的密文：");
        String secret = sc.next();
        System.out.println(secret+" 解密后的密码为: "+encryptor.decrypt(secret));
    }*/
}

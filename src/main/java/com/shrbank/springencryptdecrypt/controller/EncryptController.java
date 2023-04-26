package com.shrbank.springencryptdecrypt.controller;


import com.shrbank.springencryptdecrypt.constant.EnumResult;
import com.shrbank.springencryptdecrypt.service.Encryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * @author 淡漠
 */
@RestController
public class EncryptController {
    @Autowired
    private Encryptor encryptor;

    @PostMapping("/encrypt")
    public String encrypt(@RequestParam String text,@RequestParam String password) {
        if (text.equals("") || text == null){
            return EnumResult.ENCRY_OR_DECRY_TEXT_IS_BLANK.getMessage();
        }
        if (password.equals("") || password == null){
            return EnumResult.ENCRY_OR_DECRY_PASSWORD_IS_BLANK.getMessage();
        }
        return encryptor.encrypt(text,password);
    }

    @PostMapping("/decrypt")
    public String decrypt(@RequestParam String text,@RequestParam String password) {
        if (text.equals("") || text == null){
            return EnumResult.ENCRY_OR_DECRY_TEXT_IS_BLANK.getMessage();
        }
        if (password.equals("") || password == null){
            return EnumResult.ENCRY_OR_DECRY_PASSWORD_IS_BLANK.getMessage();
        }
        String result = null;
        try {
            result = encryptor.decrypt(text, password);
        }catch (Exception e){
            return EnumResult.DECRY_OCCUR_ERROR.getCode();
        }
        return result;
    }
}


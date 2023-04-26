package com.shrbank.springencryptdecrypt.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author 淡漠
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum EnumResult {
    ENCRY_OR_DECRY_TEXT_IS_BLANK("900000","加密或解密文本为空"),
    ENCRY_OR_DECRY_PASSWORD_IS_BLANK("900001","加密或解密密钥为空"),
    DECRY_OCCUR_ERROR("900002","解密失败，请检查密钥！");


    private String code;
    private String message;
}

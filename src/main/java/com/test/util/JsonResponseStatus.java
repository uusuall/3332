package com.test.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum JsonResponseStatus {
    SUCCESS(200,"成功"),
    ERROR(100,"失败"),
    NULLCOUNT(201,"登陆失败"),
    NULLACCOUNT(204,"账号不存在"),
    PWDERROR(205,"密码错误"),
    ACCOUNTEXIT(206,"账号已存在")
    ;

    private Integer code;
    private String msg;
}

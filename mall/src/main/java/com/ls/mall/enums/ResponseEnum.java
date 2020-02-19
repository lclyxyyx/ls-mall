package com.ls.mall.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @className: ResponseEnum
 * @description:
 * @author: liusCoding
 * @create: 2020-02-14 18:51
 */

@Getter
@AllArgsConstructor
public enum ResponseEnum {
    ERROR(-1, "服务端错误"),

    SUCCESS(0, "成功"),

    PASSWORD_ERROR(1, "密码错误"),

    USERNAME_EXIST(2, "用户已存在"),

    PARAM_ERROR(3, "参数错误"),

    EMAIL_EXSIT(4, "邮箱已存在"),

    USERNAME_OR_PASSWORD_ERROR(11, "用户名或密码错误"),

    NEED_LOGIN(10, "用户未登录，请先登录"),

    PRODUCT_OFF_SALE_OR_DELETE(12, "商品下架或删除"),

    PRODUCT_NO_EXIST(13, "商品不存在"),

    PRODUCT_STOCK_ERROR(14, "库存不正确"),

    CART_PRODUCT_NO_EXIST(15, "购物车无此商品"),

    DELETE_SHIPPING_FAIL(16, "删除收货地址失败"),
    ;


    private Integer code;

    private String msg;
}
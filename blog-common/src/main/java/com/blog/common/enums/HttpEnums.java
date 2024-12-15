package com.blog.common.enums;

import lombok.Getter;

/**
 * 返回枚举
 *
 * @author nhh
 */
@Getter
public enum HttpEnums {

    SUCCESS(200,"请求成功"),
    FAIL(400,"请求失败");

    private final Integer code;

    private final String msg;

    HttpEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}

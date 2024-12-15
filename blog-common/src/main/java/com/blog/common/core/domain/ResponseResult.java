package com.blog.common.core.domain;

import com.blog.common.enums.HttpEnums;
import lombok.Data;

/**
 * 统一响应体结果
 *
 * @author nhh
 */
@Data
public class ResponseResult<T> {

    private int code;

    private String msg;

    private T data;

    public static <T> ResponseResult<T> success() {
        return responseResult(HttpEnums.SUCCESS, null);
    }

    public static <T> ResponseResult<T> success(T data) {
        return responseResult(HttpEnums.SUCCESS, data);
    }

    public static <T> ResponseResult<T> fail() {
        return responseResult(HttpEnums.FAIL, null);
    }

    private static <T> ResponseResult<T> responseResult(int code, String msg, T data) {
        ResponseResult<T> result = new ResponseResult<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    private static <T> ResponseResult<T> responseResult(HttpEnums enums, T data) {
        ResponseResult<T> result = new ResponseResult<>();
        Integer code = enums.getCode();
        String msg = enums.getMsg();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

}

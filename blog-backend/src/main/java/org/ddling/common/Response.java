package org.ddling.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class Response<T> {

    private int code;

    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public static <T> Response<T> success() {
        Response<T> response = new Response<>();
        setResult(response, ResultCode.SUCCESS);
        return response;
    }

    public static <T> Response<T> success(T obj) {
        Response<T> response = new Response<>();
        setResult(response, ResultCode.SUCCESS);
        response.setData(obj);
        return response;
    }

    public static <T> Response<T> failure(ResultCode resultCode, String msg) {
        Response<T> response = new Response<>();
        setResult(response, resultCode);
        response.setMsg(msg);
        return response;
    }

    private static void setResult(Response response, ResultCode resultCode) {
        response.setCode(resultCode.code);
        response.setMsg(resultCode.msg);
    }

}

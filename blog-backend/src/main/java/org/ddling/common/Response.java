package org.ddling.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class Response<T> {

    private boolean success;

    private String code;

    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public static <T> Response<T> success() {
        Response<T> response = new Response<>();
        response.setSuccess(true);
        response.setMsg("success");
        return response;
    }

    public static <T> Response<T> success(T obj) {
        Response<T> response = new Response<>();
        response.setSuccess(true);
        response.setMsg("success");
        response.setData(obj);
        return response;
    }

}

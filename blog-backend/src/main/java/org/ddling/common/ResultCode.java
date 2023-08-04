package org.ddling.common;

public enum ResultCode {

    SUCCESS(200, "success"),
    PARAMS_IS_NOT_VALID(400, "params is not valid");

    int code;

    String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}

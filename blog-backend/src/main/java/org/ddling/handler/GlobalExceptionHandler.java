package org.ddling.handler;

import org.ddling.common.Response;
import org.ddling.common.ResultCode;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Response paramsException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();

        String msg = "";
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            msg = String.format("%s", fieldError.getDefaultMessage());
        }
        return Response.failure(ResultCode.PARAMS_IS_NOT_VALID, msg);
    }

}

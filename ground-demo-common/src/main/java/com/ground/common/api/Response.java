package com.ground.common.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Response<T> implements Serializable {

    private boolean success;

    private T result;

    private String code;

    private String message;

    public static <T> Response<T> ok(T data) {
        Response<T> response = new Response<>();
        response.setSuccess(true);
        response.setResult(data);
        return response;
    }

    public static <T> Response<T> ok() {
        return ok(null);
    }

    public static <T> Response<T> fail(String code, String message) {
        Response<T> resp = new Response<>();
        resp.setCode(code);
        resp.setMessage(message);
        resp.setSuccess(false);
        return resp;
    }

    public static <T> Response<T> failOfMessage(String message) {
        Response<T> resp = new Response<>();
        resp.setMessage(message);
        resp.setSuccess(false);
        return resp;
    }

    public static <T> Response<T> fail(String code) {
        Response<T> resp = new Response<>();
        resp.setCode(code);
        resp.setSuccess(false);
        return resp;
    }


    public String toString() {
        return "Response(success=" + this.isSuccess() + ", result=" + this.getResult() + ", code=" + this.getCode() + ", message=" + this.getMessage() + ")";
    }
}

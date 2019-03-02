package com.qianyi.microservice.manager.pojo;

/**
 * project:itcast-microservice-user
 * function:
 * author:kangkang
 * date: 2019/2/24
 */
public class BaseResult {

    //0:失败，1:success
    private int code;

    //提示信息
    private String message;

    public BaseResult(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public BaseResult() {
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    //数据对象
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

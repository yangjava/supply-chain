package com.chain.api;

public class ReturnT<T>{

    private Boolean success;

    private String code;

    private String msg;

    private T  data;

    public ReturnT(T data) {
        new ReturnT(true,null,null,data);
    }

    public ReturnT(String code, String msg) {
      new ReturnT(false,code,msg,null);
    }

    public ReturnT(String msg) {
        new ReturnT(false,null,msg,null);
    }

    private ReturnT(Boolean success, String code, String msg, T data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    public Boolean ok(){
        return success==true;
    }

    public Boolean fail(){
        return success==false;
    }
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ReturnT{" +
                "success=" + success +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}

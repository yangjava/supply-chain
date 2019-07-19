package com.chain.api;

public class ReturnTHelper{

    public static <T> ReturnT returnOk(T data){
        return new ReturnT(data);
    }

    public static <T> ReturnT returnFail(String code,String msg){
        return new ReturnT(code,msg);
    }

    public static <T> ReturnT returnMsg(String msg){
        return new ReturnT(msg);
    }
}

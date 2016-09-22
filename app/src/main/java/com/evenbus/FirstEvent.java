package com.evenbus;

/**
 * Created by 123 on 2016/9/22.
 */
//建一个实体类
public class FirstEvent{
    private String mMsg;

    public FirstEvent(String msg){
        // TODO Auto-generated constructor stub
        mMsg = msg;
    }

    public String getMsg(){
        return mMsg;
    }
}
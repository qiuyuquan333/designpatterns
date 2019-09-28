package com.qyq.designpatterns.adapter;

/**
 * 适配者类（我们有的）
 */
public class Adaptee {

     int outPut220V(){
        int voltage = 220;
        System.out.println("适配者电压："+voltage+"V");
        return voltage;
    }
}

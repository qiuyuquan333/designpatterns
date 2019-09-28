package com.qyq.designpatterns.adapter;

public class main {

    public static void main(String[] args) {
        //类适配器
        Target target = new ClassAdapter();
        target.outPut5V();
        System.out.println("#####################");
        //对象适配器
        Target target1 = new ObjectAdapter(new Adaptee());
        target1.outPut5V();
    }
}

package com.qyq.designpatterns.abstractFactory;

public class BlackDog implements Dog {
    @Override
    public void color() {
        System.out.println("这是一只黑狗");
    }
}

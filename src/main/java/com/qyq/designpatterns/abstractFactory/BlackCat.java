package com.qyq.designpatterns.abstractFactory;

public class BlackCat implements Cat {
    @Override
    public void color() {
        System.out.println("这是一只黑猫");
    }
}

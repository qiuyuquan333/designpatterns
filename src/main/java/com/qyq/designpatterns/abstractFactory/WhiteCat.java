package com.qyq.designpatterns.abstractFactory;

public class WhiteCat implements Cat {
    @Override
    public void color() {
        System.out.println("这是一个白猫");
    }
}

package com.qyq.designpatterns.abstractFactory;

public class WhiteDog implements Dog {
    @Override
    public void color() {
        System.out.println("这是一只白狗");
    }
}

package com.qyq.designpatterns.factory;

public class English implements Book {
    @Override
    public void type() {
        System.out.println("英语书");
    }
}

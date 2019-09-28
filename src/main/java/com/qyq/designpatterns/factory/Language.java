package com.qyq.designpatterns.factory;

public class Language implements Book {
    @Override
    public void type() {
        System.out.println("语文书");
    }
}

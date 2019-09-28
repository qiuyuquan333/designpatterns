package com.qyq.designpatterns.singlecase;

public class main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);

    }
}

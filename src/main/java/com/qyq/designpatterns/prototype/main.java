package com.qyq.designpatterns.prototype;

public class main {

    public static void main(String[] args) {
        Prototype prototype1 = new ConcretePrototype("Prototype");
        Prototype prototype2 = (Prototype) prototype1.clone();
        System.out.println(prototype1.getName());
        System.out.println(prototype2.getName());

    }
}

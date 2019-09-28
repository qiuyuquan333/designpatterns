package com.qyq.designpatterns.factory;

public class StudentFactory implements ReadFactory {

    @Override
    public Book read() {
        return new English();
    }
}

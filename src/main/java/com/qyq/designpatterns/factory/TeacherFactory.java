package com.qyq.designpatterns.factory;

public class TeacherFactory implements ReadFactory {

    @Override
    public Book read() {
        return new Language();
    }
}

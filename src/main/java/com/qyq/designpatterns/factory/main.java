package com.qyq.designpatterns.factory;

public class main {

    public static void main(String[] args) {
        ReadFactory teacherFactory = new TeacherFactory();
        teacherFactory.read().type();

        ReadFactory studentFactory = new StudentFactory();
        studentFactory.read().type();

        System.out.println("################################");

        //反射工厂
//        Book book = BookFactory.getBook("com.qyq.designpatterns.factory.English");
//        book.type();

        Book book = BookFactory.getBook(Language.class);
        book.type();
    }
}

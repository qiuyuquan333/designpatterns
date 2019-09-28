package com.qyq.designpatterns.builder;

public class main {

    public static void main(String[] args) {
        PersonDirector personDirector = new PersonDirector();
        Person person = personDirector.constructPerson(new ManBuilder());
        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());

    }
}

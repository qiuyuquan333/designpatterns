package com.qyq.designpatterns.builder;

public class ManBuilder implements PersonBuilder {

    Person person;

    public ManBuilder(){
        person = new Person();
    }

    @Override
    public void buildHead() {
        person.setHead("建造男人的头部");
    }

    @Override
    public void buildBody() {
        person.setBody("建造男人的身体");
    }

    @Override
    public void buildFoot() {
        person.setFoot("建造男人的脚部");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}

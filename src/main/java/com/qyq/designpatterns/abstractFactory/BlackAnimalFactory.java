package com.qyq.designpatterns.abstractFactory;

public class BlackAnimalFactory implements AnimalFactory {
    @Override
    public Cat cat() {
        return new BlackCat();
    }

    @Override
    public Dog dog() {
        return new BlackDog();
    }
}

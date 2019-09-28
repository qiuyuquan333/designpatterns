package com.qyq.designpatterns.abstractFactory;

public class WhiteAnimalFactory implements AnimalFactory {
    @Override
    public Cat cat() {
        return new WhiteCat();
    }

    @Override
    public Dog dog() {
        return new WhiteDog();
    }
}

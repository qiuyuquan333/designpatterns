package com.qyq.designpatterns.abstractFactory;

public class main {

    public static void main(String[] args) {
        AnimalFactory whiteAnimalFactory = new WhiteAnimalFactory();
        whiteAnimalFactory.cat().color();
        whiteAnimalFactory.dog().color();

        AnimalFactory blackAnimalFactory = new BlackAnimalFactory();
        blackAnimalFactory.cat().color();
        blackAnimalFactory.dog().color();
    }
}

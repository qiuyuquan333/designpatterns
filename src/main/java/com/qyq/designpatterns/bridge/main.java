package com.qyq.designpatterns.bridge;

public class main {

    public static void main(String[] args) {
        BrushPen big = new BigBrushPen(new Red());
        big.penType();
    }
}

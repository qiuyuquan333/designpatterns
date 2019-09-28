package com.qyq.designpatterns.bridge;

public class BigBrushPen extends BrushPen {

    public BigBrushPen(Color color){
        super.setColor(color);
    }

    @Override
    public void penType() {
        String color = super.getColor().setColor();
        System.out.println(color+"大毛笔");
    }
}

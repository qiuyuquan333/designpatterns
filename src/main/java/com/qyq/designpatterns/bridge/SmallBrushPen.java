package com.qyq.designpatterns.bridge;

public class SmallBrushPen extends BrushPen {

    public SmallBrushPen(Color color){
        setColor(color);
    }

    @Override
    void penType() {
        String color = super.getColor().setColor();
        System.out.println(color+"小毛笔");
    }
}

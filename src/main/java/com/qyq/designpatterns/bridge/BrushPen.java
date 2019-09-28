package com.qyq.designpatterns.bridge;

public abstract class BrushPen {

    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    abstract void penType();
}

package com.spring.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demoObject")
public class Demo {
    @Value("#{ 11 + 22}")
    private int x;
    @Value("#{ 2+5+56+34}")
    private int y;

    public Demo() {
    }

    public Demo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

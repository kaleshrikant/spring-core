package com.spring.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demoObject")
public class Demo {
    @Value("#{ 11 + 22}")
    private int x;
    @Value("#{ 2+5+56+34}")
    private int y;
    @Value("#{ T(java.lang.Math).sqrt(25) }")
    private double z;
    @Value("#{ T(java.lang.Math).E }")
    private double E;

    @Value("#{ new java.lang.String('Shrikant Kale')}")
    private String name;

    @Value("#{ 3 > 3 }")
    private boolean isActive;

    public Demo() {
    }

    public Demo(int x, int y, double z, double e, String name, boolean isActive) {
        this.x = x;
        this.y = y;
        this.z = z;
        E = e;
        this.name = name;
        this.isActive = isActive;
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getE() {
        return E;
    }

    public void setE(double e) {
        E = e;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", E=" + E +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
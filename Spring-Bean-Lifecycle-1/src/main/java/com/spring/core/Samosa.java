package com.spring.core;

public class Samosa {
    private double price;

    public void init() {
        System.out.println("inside init()");
    }
    public void destroy() {
        System.out.println("inside destroy()");
    }

    public void hi() {
        System.out.println("inside hi()");
    }
    public void bye() {
        System.out.println("inside bye()");
    }

    public Samosa(double price) {
        this.price = price;
    }

    public Samosa() {
    }

    public double getPrice() {
        System.out.println("getting samosa price");
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting samosa price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
}

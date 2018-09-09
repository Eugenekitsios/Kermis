package com.company;

public class Attractie {

    private String name;
    private double price;
    private double surface;

    public Attractie(String name, double price, double surface) {
        this.name = name;
        this.price = price;
        this.surface = surface;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getSurface() {
        return surface;
    }

    public void draaien(){
        System.out.println("Attractie " + this.name + " draait");
    }
}



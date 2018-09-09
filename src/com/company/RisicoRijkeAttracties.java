package com.company;

public abstract class RisicoRijkeAttracties extends Attractie{

    private String name;
    private double price;
    private int draailimiet;

    public RisicoRijkeAttracties(String name, double price, double surface, int draailimiet) {
        super(name, price, surface);
        this.draailimiet = draailimiet;
    }




    public abstract boolean opstellingsKeuring();

}




package com.company;

public class Spookhuis extends Attractie {

    private double omzet;
    private int aantalVerkochteKaartjes;

    public Spookhuis (){
        super("spookhuis", 3.20, 0);
    }

    public double getOmzet() {
        return omzet;
    }

    public int getAantalVerkochteKaartjes() {
        return aantalVerkochteKaartjes;
    }

    public void setOmzet() {
        this.omzet += 3.20;
        Kassa.setOmzet(3.20);
    }

    public void setAantalVerkochteKaartjes() {
        this.aantalVerkochteKaartjes += 1;
        Kassa.setAantalVerkochteKaartjes();
    }
}

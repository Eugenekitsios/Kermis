package com.company;

public class Botsauto extends Attractie {

    private double omzet;
    private int aantalVerkochteKaartjes;

    public Botsauto(){
        super("botsauto", 2.50, 0);

    }

    public double getOmzet() {
        return omzet;
    }

    public int getAantalVerkochteKaartjes() {
        return aantalVerkochteKaartjes;
    }

    public void setOmzet() {
        this.omzet += 2.50;
        Kassa.setOmzet(2.50);

    }

    public void setAantalVerkochteKaartjes() {
        this.aantalVerkochteKaartjes += 1;
        Kassa.setAantalVerkochteKaartjes();
    }
}

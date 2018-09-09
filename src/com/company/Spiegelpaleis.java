package com.company;

public class Spiegelpaleis extends Attractie {

    private double omzet;
    private int aantalVerkochteKaartjes;

    public Spiegelpaleis(){
        super("spiegelpaleis", 2.75, 0);
    }

    public double getOmzet() {
        return omzet;
    }

    public int getAantalVerkochteKaartjes() {
        return aantalVerkochteKaartjes;
    }

    public void setOmzet() {
        this.omzet += 2.75;
        Kassa.setOmzet(2.75);
    }

    public void setAantalVerkochteKaartjes() {
        this.aantalVerkochteKaartjes += 1;
        Kassa.setAantalVerkochteKaartjes();
    }
}

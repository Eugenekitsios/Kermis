package com.company;

public class Hawaii extends RisicoRijkeAttracties {

    private double omzet;
    private int aantalVerkochteKaartjes;
    private int draailimiet;

    public Hawaii() {
        super("hawaii", 2.90, 0, 10);
    }

    public double getOmzet() {
        return omzet;
    }

    public int getAantalVerkochteKaartjes() {
        return aantalVerkochteKaartjes;
    }

    public void setOmzet() {
        this.omzet += 2.90;
        Kassa.setOmzet(2.90);
    }

    public void setAantalVerkochteKaartjes() {
        this.aantalVerkochteKaartjes += 1;
        Kassa.setAantalVerkochteKaartjes();
    }

    @Override
    public void draaien() {
        this.draailimiet++;
        super.draaien();
    }

    @Override
    public boolean opstellingsKeuring() {
        if (draailimiet >= 10) {
            return true;
        } else {
            return false;
        }
    }
}


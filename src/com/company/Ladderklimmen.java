package com.company;

public class Ladderklimmen extends Attractie implements GokAttractie {

    private double omzet;
    private int aantalVerkochteKaartjes;
    private double omzetminusbelasting;
    private double omzet3;
    private double omzet4;

    public Ladderklimmen(){
        super("ladderklimmen", 5.00, 0);
    }

    public double getOmzet() {
        return omzet;
    }

    public int getAantalVerkochteKaartjes() {
        return aantalVerkochteKaartjes;
    }

    public void setOmzet() {
        this.omzet += 5.00;
        this.omzetminusbelasting += 5;
        this.omzet3 += 5;
        this.omzet4 += 5;
        Kassa.setOmzet(5.00);
    }

    public void setAantalVerkochteKaartjes() {
        this.aantalVerkochteKaartjes += 1;
        Kassa.setAantalVerkochteKaartjes();
    }

    public void setOmzetminusbelasting(double omzetminusbelasting) {
        this.omzetminusbelasting = omzetminusbelasting;
    }

    @Override
    public double kansSpelBelasting() {
        this.omzetminusbelasting = ((this.omzet3/100)*30);
        Kassa.setOmzet(-this.omzetminusbelasting);
        this.omzet3 -= this.omzetminusbelasting;
        this.omzet4 -= this.omzetminusbelasting;
        return this.omzetminusbelasting;

    }

    @Override
    public double getOmzetminusbelasting() {
        return this.omzetminusbelasting;
    }

    @Override
    public void setOmzet3(double x) {
        this.omzet3 = x;
    }

    public double getOmzet4() {
        return omzet4;
    }
}

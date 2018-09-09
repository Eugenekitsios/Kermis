package com.company;

public class Spin extends RisicoRijkeAttracties implements GokAttractie  {

    private double omzet;
    private int aantalVerkochteKaartjes;
    private int draailimiet;
    private double omzetminusbelasting;
    private double omzet3;
    private double omzet4;


    public Spin (){
        super("spin", 2.25, 0, 5);
    }

    public double getOmzet() {
        return omzet;
    }

    public int getAantalVerkochteKaartjes() {
        return aantalVerkochteKaartjes;
    }

    public void setOmzet() {
        this.omzet += 2.25;
        this.omzetminusbelasting += 2.25;
        this.omzet3 += 2.25;

        Kassa.setOmzet(2.25);
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
        if(draailimiet>=5){
            return true;
        } else{
            return false;
        }
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

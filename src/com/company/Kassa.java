package com.company;

public class Kassa {

    private static double omzet;
    private static double omzetmetbelasting;

    private static int aantalVerkochteKaartjes;
    private static int bezoekBelastingInspecteur;


    public static double getOmzet() {
        return omzet;
    }

    public static void setOmzet(double omzet2) {

        omzet += omzet2;
        omzetmetbelasting += omzet2;
    }

    public static void resetOmzet(double omzet2) {

        omzet += omzet2;

    }



    public int getAantalVerkochteKaartjes() {
        return aantalVerkochteKaartjes;
    }

    public static void setAantalVerkochteKaartjes() {
        aantalVerkochteKaartjes += 1;
    }

    public static void setBezoekBelastingInspecteur() {
        bezoekBelastingInspecteur+=1;
    }


    public double getOmzetmetbelasting() {
        return omzetmetbelasting;
    }

    public static int getBezoekBelastingInspecteur() {
        return bezoekBelastingInspecteur;
    }
}




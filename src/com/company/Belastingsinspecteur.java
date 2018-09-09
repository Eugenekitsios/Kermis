package com.company;

public class Belastingsinspecteur {

    private static double belasting;


    public void belastinginnen(Attractie attractie) {
        if (attractie instanceof GokAttractie) {
            if (Kassa.getOmzet() == 0) {
                return;
            } else if (((GokAttractie) attractie).getOmzetminusbelasting() == 0) {
                return;
            } else {
                belasting += ((GokAttractie) attractie).kansSpelBelasting();
                ((GokAttractie) attractie).setOmzetminusbelasting(0);
                ((GokAttractie) attractie).setOmzet3(0);
            }
        } else
            return;
    }

    public double getBelasting() {
        return belasting;

    }
}

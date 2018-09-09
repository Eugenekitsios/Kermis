package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Botsauto botsauto = new Botsauto();
        Spin spin = new Spin();
        Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
        Spookhuis spookhuis = new Spookhuis();
        Hawaii hawaii = new Hawaii();
        Ladderklimmen ladderklimmen = new Ladderklimmen();
        Kassa kassa = new Kassa();

        Belastingsinspecteur belastingsinspecteur = new Belastingsinspecteur();


        toonOpties();

        boolean quit = false;
        while (!quit){

            System.out.println("Voer uw keuze in: ");
            char keuze = scanner.next().charAt(0);

            switch(keuze){
                case '1':
                    botsauto.draaien();
                    botsauto.setAantalVerkochteKaartjes();
                    botsauto.setOmzet();
                    break;
                case '2':
                    if(!spin.opstellingsKeuring()){
                        spin.draaien();
                        spin.setAantalVerkochteKaartjes();
                        spin.setOmzet();
                    } else {
                        System.out.println("Onderhoudsbeurt nodig");
                    }
                    break;
                case '3':
                    spiegelpaleis.draaien();
                    spiegelpaleis.setAantalVerkochteKaartjes();
                    spiegelpaleis.setOmzet();
                    break;
                case '4':
                    spookhuis.draaien();
                    spookhuis.setAantalVerkochteKaartjes();
                    spookhuis.setOmzet();
                    break;
                case '5':
                    if(!hawaii.opstellingsKeuring()) {
                        hawaii.draaien();
                        hawaii.setAantalVerkochteKaartjes();
                        hawaii.setOmzet();
                    } else {
                        System.out.println("Onderhoudsbeurt nodig");
                    }
                    break;
                case '6':
                    ladderklimmen.draaien();
                    ladderklimmen.setAantalVerkochteKaartjes();
                    ladderklimmen.setOmzet();
                    break;
                case 'o':
                    System.out.println("Omzet: \n" +
                            "Botsauto's: " + botsauto.getOmzet() + "\n" +
                            "Spin: " + spin.getOmzet4() + "\n" +
                            "Spiegelpaleis: " + spiegelpaleis.getOmzet() + "\n" +
                            "Spookhuis: " + spookhuis.getOmzet() + "\n" +
                            "Hawaii: " + hawaii.getOmzet() + "\n" +
                            "Ladderklimmen: " + ladderklimmen.getOmzet4() + "\n" +
                            "****************************************\n" +
                            "Kermis omzet totaal, inclusief betaalde belasting: " + kassa.getOmzetmetbelasting() + "\n" +
                            "Aantal bezoeken belastingsinspecteur: " + Kassa.getBezoekBelastingInspecteur());
                    break;


                case 'k':
                    System.out.println("Aantal verkochte kaartjes \n" +
                            "Botsauto's: " + botsauto.getAantalVerkochteKaartjes() + "\n" +
                            "Spin: " + spin.getAantalVerkochteKaartjes() + "\n" +
                            "Spiegelpaleis: " + spiegelpaleis.getAantalVerkochteKaartjes() + "\n" +
                            "Spookhuis: " + spookhuis.getAantalVerkochteKaartjes() + "\n" +
                            "Hawaii: " + hawaii.getAantalVerkochteKaartjes() + "\n" +
                            "Ladderklimmen: " + ladderklimmen.getAantalVerkochteKaartjes() + "\n" +
                            "****************************************\n" +
                            "Kermis totaal verkochte kaartjes: " + kassa.getAantalVerkochteKaartjes());
                    break;

                case 'b':
                    belastingsinspecteur.belastinginnen(ladderklimmen);
                    belastingsinspecteur.belastinginnen(spin);
                    belastingsinspecteur.belastinginnen(hawaii);
                    belastingsinspecteur.belastinginnen(botsauto);
                    belastingsinspecteur.belastinginnen(spiegelpaleis);
                    belastingsinspecteur.belastinginnen(spookhuis);
                    Kassa.setBezoekBelastingInspecteur();
                    Kassa.resetOmzet(-Kassa.getOmzet());
                    System.out.println("Belastingsinspecteur is geweest. " + belastingsinspecteur.getBelasting() + " totaal aan omzetbelasting betaald.");
                    break;


                case 'q':
                    System.out.println("Kermis sluit...");
                    quit = true;
            }

        }

    }

    public static void toonOpties(){
        System.out.println("Toets: \n" +
                "1 - voor botsauto's \n" +
                "2 - voor spin \n" +
                "3 - voor spiegelpaleis\n" +
                "4 - voor spookhuis \n" +
                "5 - voor hawaii \n" +
                "6 - voor ladderklimmen\n" +
                "o - Voor omzet van de kermis\n" +
                "k - voor aantal verkochte kaartjes \n" +
                "b - voor een bezoek van de belastingsinspecteur \n" +
                "q - om te sluiten");


    }
}

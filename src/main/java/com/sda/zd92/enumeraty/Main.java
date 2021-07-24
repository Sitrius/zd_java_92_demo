package com.sda.zd92.enumeraty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Marka samochodu:
        // - AUDI
        // - BMW
        // - MERCEDES
        // - VOKLSWAGEN

        // Płeć:
        // - KOBIETA
        // - MĘŻCZYZNA
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz markę samochodu:");

        MarkaSamochodu wybranyEnum = null;
        do {
            try {
                System.out.println("Dostępne opcje:");
                for (MarkaSamochodu marka : MarkaSamochodu.values()) {
                    System.out.println(" - " + marka);
                }

                String wpisanaWartosc = scanner.next();
                // Audi aUdi auDi -> AUDI
                // valueOf - metoda użyta w linii niżej służy do zamiany wartości tekstowej na enumową.
                // Każdy enum posiada zaimplementowaną metodę valueOf na swój własny indywidualny sposób
                // ważne by na wejściu tekst był taki sam (nawet wielkość liter)
                wybranyEnum = MarkaSamochodu.valueOf(wpisanaWartosc.toUpperCase());
            } catch (IllegalArgumentException iae) {
                System.err.println("Niepoprawna wartość.");
            }
        }while (wybranyEnum == null);

        System.out.println("Wybrałeś/łaś: " + wybranyEnum);
    }
}

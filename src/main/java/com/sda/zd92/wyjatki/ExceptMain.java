package com.sda.zd92.wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptMain {
    public static void main(String[] args) {
        try {
            // instrukcje które potencjalnie mogą wywołać / zakończyć się wyjątkiem

            // sprawdź stan konta
            // wypłać pieniądze
            // zaaktualizuj stan konta
        } catch (Exception e) { // przechwycenie RODZAJU wyjątku
            // blok który wykona się jeśli otrzymamy wyjątek

            // naprawić swój błąd/dokończyć akcję z błędem
        }

//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 4; i++) {
//            try {
//                double liczba = scanner.nextDouble();
//                System.out.println("Wpisałeś : " + liczba);
//            } catch (InputMismatchException ime) {
//                // napraw bufor - usuń to co wpisał użytkownik
//                String ostatnioWpisaneWejscie = scanner.next();
//                System.err.println("Wprowadziłeś/łaś niepoprawne wejście: '" + ostatnioWpisaneWejscie + "'! Powtórz!");
//                i--;
//            }
//        }
        wykonajKodZException();
        System.out.println("Ja Też Zawsze sie wykonam");
        System.out.println("Program się zakończył.");
    }

    private static void wykonajKodZException() {
        final int size = 10;

        int[] tablica = new int[size];
        if (tablica.length > size) {
            System.out.println(tablica[15]);
        }
        // co się wydarzy? - wyjątek ArrayIndexOutOfBoundsException
        // czy jest wyjątkiem jawnym ? Nie
        // dlaczego - nie jest na nas wymuszone przechwycenie wyjątku

        int liczba = -1;
        try {
            sprawdzIndeksLiczby(tablica, liczba);
            //
            return;
        } catch (LiczbaJestZbytNiska liczbaJestZbytNiska) {
            liczbaJestZbytNiska.printStackTrace();

//
/*        } catch (Exception liczbaJestZbytNiska) {
            System.out.println("Coś poszło nietak");*/

//
        } finally { // WYKONUJE SIĘ ZAWSZE niezależnie od tego czy był błąd czy nie
            System.out.println("Zawsze sie wykonam");
        }
    }

    /**
     * Dokumentacja
     *
     * @param tablica
     * @param liczba
     * @throws LiczbaJestZbytNiska
     */
//    private static void sprawdzIndeksLiczby(int[] tablica, int liczba) throws LiczbaJestZbytNiska {
//        if (liczba < 0){
//            throw new LiczbaJestZbytNiska();
//        }
//    }
    private static void sprawdzIndeksLiczby(int[] tablica, int liczba) {
        if (liczba < 0) {
//            throw new LiczbaJestZbytNiska();
            throw new JakisInnyWyjatek();
        }
    }
}

package com.sda.zd92.pliki.odczyt;

import java.io.*;
import java.util.Scanner;

public class OdczytCalegoPlikuScanner {
    public static void main(String[] args) {
        // 1 forma = BufferedReader
        // 2 forma = Scanner

        String sciezka = "output_1.txt";
        if (new File(sciezka).exists()) {
            try (Scanner scanner = new Scanner(new FileReader(sciezka))) {

                String linia;
                while (scanner.hasNextLine()){  // dopóki jest następna linia (jeśli nie będzie zwraca nam false)
                    linia = scanner.nextLine(); // jeśli wynik metody wyżej będzie false a my odczytamy to mamy exception
                    System.out.println(linia);  // wypisanie
                }

            } catch (FileNotFoundException e) {
                System.out.println("Nie ma takiego pliku");
            }
        } else {
            System.err.println("Nie ma takiego pliku!");
        }
    }
}

package com.sda.zd92.pliki.odczyt;

import java.io.*;

public class OdczytCalegoPlikuBufferedReader2 {
    public static void main(String[] args) {
        // 1 forma = BufferedReader
        // 2 forma = Scanner

        String sciezka = "output_1.txt";
        if (new File(sciezka).exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(sciezka))) {

                String linia;
                // BufferedReader zwraca null z metody readLine jeśli nie ma następnej linii
                // wewnątrz while robimy 2 rzeczy
                // 1. do zmiennej linia przypisz wynik funkcji reader.readLine
                // 2. po wykonaniu pkt1. sprawdź czy treść zmiennej linia jest != null
                while ( (linia = reader.readLine()) != null){
                    // wypisz
                    System.out.println(linia);
                }

            } catch (FileNotFoundException e) {
                System.out.println("Nie ma takiego pliku");
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        } else {
            System.err.println("Nie ma takiego pliku!");
        }
    }
}

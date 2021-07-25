package com.sda.zd92.pliki.odczyt;

import java.io.*;

public class OdczytCalegoPlikuBufferedReader1 {
    public static void main(String[] args) {
        // 1 forma = BufferedReader
        // 2 forma = Scanner

        String sciezka = "output_1.txt";
        if (new File(sciezka).exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(sciezka))) {

                String linia = reader.readLine();
                // BufferedReader zwraca null z metody readLine jeśli nie ma następnej linii
                while (linia != null){ // dopóki mamy linię (lub na początku "jeśli jest linia")
                    System.out.println(linia);
                    linia = reader.readLine();  // odczyt kolejnej linii
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

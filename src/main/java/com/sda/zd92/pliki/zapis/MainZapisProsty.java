package com.sda.zd92.pliki.zapis;

import java.io.*;

public class MainZapisProsty {
    public static void main(String[] args) {
        // bardzo koniecznie przy otwieraniu plików wymusza się implementację złapania wyjątków IO

        // WYRÓŻNIAMY WIELE OPERACJI NA PLIKACH:
        // - odczyt
        // - zapis
        // - egzekucja (wykonanie)

        // Gdy otwieramy plik definiujemy flagi otwarcia.
        // R - read
        // W - write - robi tzw. truncate (porzucenie starej wersji/zmian) - kompletne zapomnienie o treści NADPISZ PLIK
        // A - append - dopisz do pliku
        // Do researchu operacje binarne na plikach - tworzenie własnego formatu plików
        String sciezka = "output_1.txt";
        if (new File(sciezka).exists()) {
            // print - tekst
            FileOutputStream fos = null;
            PrintWriter writer = null;
            try {
                fos = new FileOutputStream(sciezka);
                writer = new PrintWriter(fos);

                writer.println("Hello World!");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                if (writer != null) {
                    writer.close();
                }
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

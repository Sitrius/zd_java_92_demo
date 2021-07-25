package com.sda.zd92.pliki.zapis;

import java.io.*;

public class MainZapisProstyTryWithResources {
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
        String sciezka = "zapis_output_1.txt";

        try (PrintWriter writer = new PrintWriter(new FileOutputStream(sciezka))) {
            writer.println("Hello World!");
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku.");
        }
    }
}

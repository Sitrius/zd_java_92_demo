package com.sda.zd92.pliki;

import java.io.*;
import java.util.Scanner;

public class OdczytBufferedReaderMainTryWithResources {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("taki_pslik.txt"))) {

            // przeczytanie całego pliku i wypisanie na konsole
            reader.lines().forEach(System.out::println);

        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku");
        } catch (IOException e) {
            // INPUT / OUTPUT EXCEPTION
            // Klasa nadrzędna do wszystkich wyjątków które mogą się wydarzyć w związku z wymianą informacji przez plik.

            System.err.println(e.getMessage());
        }
    }
}

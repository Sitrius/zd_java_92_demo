package com.sda.zd92.pliki.zapis;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainZapisProstyZeScanneremTryDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sciezka = "zapis_output_2.txt";


        // Try powinien być w Do
        // czy Do powinno być w Try
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(sciezka))) {
            String linia ;
            do {
                // czytam linie
                linia = scanner.nextLine();

                // zapis do pliku
                writer.println(linia);

                // wyczyść bufor, wymuś zapis do pliku
                writer.flush();

                // sprawdzenie czy linia byla quit.
            }while (!linia.equalsIgnoreCase("quit"));
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku.");
        }
    }
}

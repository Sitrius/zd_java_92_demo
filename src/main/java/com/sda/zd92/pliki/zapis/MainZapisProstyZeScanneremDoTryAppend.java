package com.sda.zd92.pliki.zapis;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainZapisProstyZeScanneremDoTryAppend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sciezka = "zapis_output_2.txt";


        // czy Try powinien być w Do
        // czy Do powinno być w Try
        String linia;
        do {
            // czytam linie
            linia = scanner.nextLine();

            try (PrintWriter writer = new PrintWriter(new FileOutputStream(sciezka, true))) {
                // zapis do pliku
                writer.println(linia);

            } catch (FileNotFoundException e) {
                System.out.println("Nie znaleziono pliku.");
            }
            // sprawdzenie czy linia byla quit.
        } while (!linia.equalsIgnoreCase("quit"));
    }
}

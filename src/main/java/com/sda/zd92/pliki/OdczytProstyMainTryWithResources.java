package com.sda.zd92.pliki;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class OdczytProstyMainTryWithResources {
    public static void main(String[] args) {
        File plikDoOdczytu = new File("taki_plik.txt");

        if (plikDoOdczytu.exists()) {
            try (Scanner scanner = new Scanner(new FileInputStream(plikDoOdczytu))) {
                // ZAWSZE MUSIMY PO SOBIE SPRZĄTAC!
                // Musimy zwalniać zasoby które sobie alokujemy

                // dopóki są słowa w pliku
                while (scanner.hasNext()){
                    String slowo = scanner.next();
                    System.out.println(slowo);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Nie ma takiego pliku");
            }
        }
    }
}

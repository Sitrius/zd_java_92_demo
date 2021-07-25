package com.sda.zd92.pliki.odczyt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class OdczytProstyMain {
    public static void main(String[] args) {
        File plikDoOdczytu = new File("taki_plik.txt");
        FileInputStream strumienWejsciaZPliku = null;
        Scanner scanner = null;
        if (plikDoOdczytu.exists()) {
            try {
                // ZAWSZE MUSIMY PO SOBIE SPRZĄTAC!
                // Musimy zwalniać zasoby które sobie alokujemy
                strumienWejsciaZPliku = new FileInputStream(plikDoOdczytu);
                scanner = new Scanner(strumienWejsciaZPliku);

                // dopóki są słowa w pliku
                while (scanner.hasNext()) {
                    String slowo = scanner.next();
                    System.out.println(slowo);
                }

                // starajmy się bardzo precyzyjnie podawać typ wyjątku którego się spodziewamy
                // i unikajmy wpisywania Exception
            } catch (FileNotFoundException e) {
                System.out.println("Nie ma takiego pliku");
            } finally {
                if (scanner != null) {
                    scanner.close();
                }
                if (strumienWejsciaZPliku != null) {
                    try {
                        strumienWejsciaZPliku.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

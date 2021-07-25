package com.sda.zd92.pliki.odczyt;

import java.io.*;

public class Zadanie1 {
    //    1. Stwórz aplikację która służy do odczytywania danych z plików które mamy na dysku, stwórz main'a w którym
    //
    //    Sprawdzaj czy w katalogu w którym uruchomiłeś program jest plik o nazwie 'output_1.txt' który posiada treść "Hello World!".
    //    Na ekran wypisz komunikat:
    //    - czy udało się znaleźć plik
    //    - czy zawiera odpowiednią treść
    //
    //    Jeśli pliku nie ma lub posiada inną zawartość napisz odpowiedni komunikat.
    public static void main(String[] args) {
        String sciezka = "output_1.txt";
        if (new File(sciezka).exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(sciezka))) {
                if (reader.readLine().equalsIgnoreCase("Hello World!")) {
                    System.out.println("Znaleziono linię!");
                } else {
                    System.out.println("Nie znaleziono linii!");
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

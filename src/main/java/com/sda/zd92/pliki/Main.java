package com.sda.zd92.pliki;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // file descriptor
        // metadane nt. pliku - nazwa, adres, wielkość, ostatnia modyfikacja, właściciel, prawa dostępu

        // możemy w projekcie skopiować ścieżkę poprzez -> PPM (prawy przycisk myszy) -> copy path -> absolute path
        // ścieżka absolutna - ponieważ prowadzi od root filesystem - korzenia systemu plików (Partycja C) - dokładny adres

        // ścieżka relatywna - jest ścieżką relatywną względem punktu uruchomienia programu
        // uruchomiłem program w katalogu: C:/Users/AmeN/Projects/zd_java_pol_92
        //      więc ścieżka do pliku to : taki_plik.txt
        String sciezkaAbsolutna = "C:/Users/AmeN/Projects/zd_java_pol_92/taki_plik.txt";
        String sciezkaRelatywna = "taki_plik.txt";

        File plik = new File(sciezkaRelatywna);

        // Czy istnieje?
        System.out.println("Czy istnieje: " + plik.exists());
        if(plik.exists()){
            System.out.println("Sciezka absolutna: " + plik.getAbsolutePath());
            System.out.println("Sciezka relative: " + plik.getPath());
            System.out.println("Nazwa: " + plik.getName());
            System.out.println("Czy jest katalogiem: " + plik.isDirectory());
            System.out.println("Wielkosc: " + plik.length());

            // milisekunda liczona od 1 stycznia 1970
            // Y2K = Year 2000
            // Numer roku był 2 cyfry = 99 / 99 00
            //9 223 372 036 854 775 807
            //    2 147 483 648
            //    1 627 206 095 600 000
            System.out.println("Data ostatniej modyfikacji: " + plik.lastModified());
            Timestamp timestamp = new Timestamp(plik.lastModified());
            LocalDateTime dateTime = timestamp.toLocalDateTime();
            System.out.println("Data ostatniej modyfikacji: " + dateTime);

            System.out.println("Czy mozemy go uruchomic jako program: " + plik.canExecute());
            System.out.println("Czy mozemy go odczytac: " + plik.canRead());
            System.out.println("Czy mozemy go zapisac: " + plik.canWrite());
            System.out.println("Czy jest ukryty: " + plik.isHidden());
        }

        // Jak stworzyć katalog:
        // Tworzymy nowy katalog - katalog ma stworzyć się w projekcie - UWAGA - czasami trwa to trochę czasu!
        File katalog = new File("nowy_katalog");
        // upewniamy się że katalog nie istnieje - nie możemy stworzyć drugiego katalogu o tej samej nazwie
        if(!katalog.exists()){
            // poniżej tworzymy katalog
            boolean stworzony = katalog.mkdir();
            System.out.println("Udało się stworzyć katalog: " + stworzony);

            // tworzymy deskryptor do pliku wewnątrz naszego nowego katalogu
            File plikWKatalogu = new File("nowy_katalog/plik.txt");
            // sprawdzamy czy taki plik nie istnieje - upewniamy się - ponownie - nie mogą istnieć 2 pliki
            // o tej samej nazwie w jednym katalogu
            if(!plikWKatalogu.exists()) {

                boolean stworzonyPlik = false;
                try {
                    // tworzymy plik - musieliśmy wrapować zawinąć instrukcję w try-catch ponieważ istnieje wiele
                    // niebezpieczeństw podczas tworzenia pliku:
                    // - brak miejsca na dysku
                    // - istnieje taki plik (o tej nazwie)
                    // - istnieje taki katalog (o tej nazwie)
                    // - brak uprawnień do zapisu
                    // - nie istnieje katalog nadrzędny
                    // - zbyt długa nazwa pliku
                    // - brak możliwości otwierania kolejnych plików
                    stworzonyPlik = plikWKatalogu.createNewFile();
                    System.out.println("Udało się stworzyć plik: " + stworzonyPlik);

                    System.out.println("Usuwam:");

                    // usuwamy plik (sprzątamy)
                    plikWKatalogu.delete();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            // usuwamy katalog.
            katalog.delete();
        }


    }
}

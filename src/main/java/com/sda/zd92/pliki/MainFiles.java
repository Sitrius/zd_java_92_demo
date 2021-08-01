package com.sda.zd92.pliki;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class MainFiles {
    public static void main(String[] args) {
        if (Files.exists(Paths.get("output_1.txt"))) {
            System.out.println("Istnieje");
        } else {
            System.out.println("Nie istnieje");
        }

        // file descriptor
        // metadane nt. pliku - nazwa, adres, wielkość, ostatnia modyfikacja, właściciel, prawa dostępu

        // możemy w projekcie skopiować ścieżkę poprzez -> PPM (prawy przycisk myszy) -> copy path -> absolute path
        // ścieżka absolutna - ponieważ prowadzi od root filesystem - korzenia systemu plików (Partycja C) - dokładny adres

        // ścieżka relatywna - jest ścieżką relatywną względem punktu uruchomienia programu
        // uruchomiłem program w katalogu: C:/Users/AmeN/Projects/zd_java_pol_92
        //      więc ścieżka do pliku to : taki_plik.txt
        String sciezkaAbsolutna = "C:/Users/AmeN/Projects/zd_java_pol_92/taki_plik.txt";
        String sciezkaRelatywna = "taki_plik.txt";

        Path sciezka = Paths.get(sciezkaRelatywna);

        // Czy istnieje?
        System.out.println("Czy istnieje: " + Files.exists(sciezka));
        try {
            if (Files.exists(sciezka)) {
                System.out.println("Sciezka absolutna: " + sciezka.toAbsolutePath());
                System.out.println("Nazwa: " + sciezka.getFileName());
                System.out.println("Czy jest katalogiem: " + Files.isDirectory(sciezka));
                System.out.println("Wielkosc: " + Files.size(sciezka));

                // milisekunda liczona od 1 stycznia 1970
                // Y2K = Year 2000
                // Numer roku był 2 cyfry = 99 / 99 00
                //9 223 372 036 854 775 807
                //    2 147 483 648
                //    1 627 206 095 600 000
                System.out.println("Data ostatniej modyfikacji: " + Files.getLastModifiedTime(sciezka));

                System.out.println("Czy mozemy go uruchomic jako program: " + Files.isExecutable(sciezka));
                System.out.println("Czy mozemy go odczytac: " + Files.isReadable(sciezka));
                System.out.println("Czy mozemy go zapisac: " + Files.isWritable(sciezka));
                System.out.println("Czy jest ukryty: " + Files.isHidden(sciezka));
            }

            // Jak stworzyć katalog:
            // Tworzymy nowy katalog - katalog ma stworzyć się w projekcie - UWAGA - czasami trwa to trochę czasu!
            Path katalog = Paths.get("nowy_katalog");
            // upewniamy się że katalog nie istnieje - nie możemy stworzyć drugiego katalogu o tej samej nazwie
            if (!Files.exists(katalog)) {
                // poniżej tworzymy katalog
                katalog = Files.createDirectory(katalog);
                System.out.println("Udało się stworzyć katalog: " + katalog);

                // tworzymy deskryptor do pliku wewnątrz naszego nowego katalogu
                Path plikWKatalogu = Paths.get("nowy_katalog/plik.txt");
                // sprawdzamy czy taki plik nie istnieje - upewniamy się - ponownie - nie mogą istnieć 2 pliki
                // o tej samej nazwie w jednym katalogu
                if (!Files.exists(plikWKatalogu)) {

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
                        plikWKatalogu = Files.createFile(plikWKatalogu);
                        System.out.println("Udało się stworzyć plik: " + plikWKatalogu);

                        System.out.println("Usuwam:");

                        // usuwamy plik (sprzątamy)
                        Files.deleteIfExists(plikWKatalogu);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                // usuwamy katalog.
                Files.deleteIfExists(katalog);
            }


        } catch (IOException e) {
            System.out.println("Błąd pliku");
        }
    }
}

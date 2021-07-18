package com.sda.zd92.modelowanie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Modele_dziennikElektroniczny {
//    public class Pupil{
//        private String imie;
//        private String kolor;
//        private LocalDate dataUr;
//    }

    // Student - podstawa
    // - dodawać/zarządzać ocenami
    // - gromadzenie studentów w jakimś miejscu z możliwością wyszukiwania
    // - zarządzanie studentami w tej kolekcji
    //

    class Ocena {
        private double wartoscOceny; // 3 / 3.5
        private String przedmiot;
    }

    class Student {
        private String indeks, imie, nazwisko;
    }

    class Dziennik{
        Map<String, Student> studenci; // mapa indeks -> student
        Map<String, List<Ocena>> oceny; // mapa indeks -> lista ocen danego studenta

        public List<Ocena> znajdzOcenyZPrzedmiotu(String indeks, String przedmiot){
            List<Ocena> ocenyStudenta = oceny.get(indeks);
            List<Ocena> ocenyZPrzedmiotu = new ArrayList<>();
            // (przepisanie ocen z wybranego przedmiotu)

            return ocenyStudenta;
        }
    }

}

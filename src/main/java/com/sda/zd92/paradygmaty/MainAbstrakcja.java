package com.sda.zd92.paradygmaty;

import java.time.LocalDate;

public class MainAbstrakcja {
    // 1. Ogólna definicja abstrakcji:
    // oderwane od rzeczywistości
    // rzeczy trudne do zrozumienia/uchwycenia przez umysł
    //
    // OOP - Object oriented Programming
    //
    // Paradygmat brzmi:
    // 2. Stwórz/odwzoruj świat rzeczywisty ALE UPROSZCZONY.
    //  Nie piszmy zbędnych głupot/pól klas.
    //
    // ProjektAutostrada:
    // - KalkulatorStawki
    // - Trasa (dystans, czas)
    // - Pojazd (rodzaj, tablicaRej, czasWjazdu, czasWyjazdu)
    //
    // - Dokładnie zdefiniujcie wymagania projektu - ZAWSZE
    // - Słońce?
    // - Zwierzęta


    class Obywatel{
        // Wszystkie ok:
        private String imie;
        private String nazwisko;
        private String pesel;
        private LocalDate dataUrodzenia;
        private String miejsceUrodzenia;

        // Nie implementujemy rzeczy które są zbędne:
        private int numerButaLewejNogi;
        private int numerButaPrawejNogi;
        private int ilośćWłosówNaGłowie;
    }
}

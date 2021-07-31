package com.sda.zd92.czas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dataUrodzenia = LocalDateTime.of(1990, 3, 3, 13, 23, 48);
        LocalDateTime dataPierwszegoKrzyku = LocalDateTime.of(1990, 3, 3, 13, 23, 50);
        LocalDateTime dataPierwszegoSnu = LocalDateTime.of(1990, 3, 3, 13, 50, 10);
        LocalDateTime dataChrztu = LocalDateTime.of(1991, 5, 1, 15, 45, 31);

        // Pomiar czasu - okres długi
        Period period = Period.between(dataUrodzenia.toLocalDate(), dataChrztu.toLocalDate());
        System.out.println("Chrzest był " + period.getDays() + " dni " + period.getMonths() + " miesiecy " + period.getYears()+ " lat");

        // Pomiar czasu - okres krótki
        Duration d = Duration.between(dataUrodzenia, dataPierwszegoKrzyku);
        System.out.println("Krzyczałeś " + d.getSeconds() + " sekund po urodzeniu");
    }
}

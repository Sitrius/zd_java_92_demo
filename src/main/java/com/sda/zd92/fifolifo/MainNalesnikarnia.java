package com.sda.zd92.fifolifo;

import java.util.*;

public class MainNalesnikarnia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> nalesniki = new LinkedList<>();
//        Stack<String> nalesniki = new Stack<>();

        String komenda;
        boolean uruchomiony = true;
        do {
            // użytkownik może wpisać więcej niż jedno słowo które my przetworzymy
            System.out.println("Podaj kolejną komendę:");
            komenda = scanner.nextLine();

            String[] elementyKomendy = komenda.split(" ");
            String akcja = elementyKomendy[0];

            // dodaj truskawkowy
            // dodaj malinowy
            // dodaj cokolwiek
            if (akcja.equalsIgnoreCase("dodaj")) {
//                nalesniki.push(elementyKomendy[1]);
                nalesniki.add(elementyKomendy[1]);
            } else if (akcja.equalsIgnoreCase("zdejmij")) {
//                System.out.println("Zdejmuję: " + nalesniki.pop());
                System.out.println("Zdejmuję: " + nalesniki.poll());

            } else if (akcja.equalsIgnoreCase("quit")) {
                System.out.println("Zamykam program.");
                uruchomiony = false;
            }
        } while (uruchomiony);

        System.out.println("Opuszczam pętlę.");
    }
}

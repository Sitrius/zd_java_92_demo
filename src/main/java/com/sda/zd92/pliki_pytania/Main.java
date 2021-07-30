package com.sda.zd92.pliki_pytania;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String nazwaPliku = "pytania.txt";
        int ileMaŻyć = 3;

        // tu będą pytania:
        List<Pytanie> pytania = new ArrayList<>();

        // Przeczytaj plik żeby dowiedzieć się jakie są pytania/odpowiedzi
        try (BufferedReader reader = new BufferedReader(new FileReader(nazwaPliku))) {
            String linia;
            while ((linia = reader.readLine()) != null) {
                // wypisz
                String pytanie = linia;
                String odp1 = reader.readLine();
                String odp2 = reader.readLine();
                String odp3 = reader.readLine();
                String odp4 = reader.readLine();
                String poprawna = reader.readLine();
                int indeksPoprawnejOdpowiedzi = Integer.parseInt(poprawna);

                Pytanie jednoPytanie = new Pytanie(pytanie,
                        new String[]{odp1, odp2, odp3, odp4},
                        indeksPoprawnejOdpowiedzi);

                pytania.add(jednoPytanie);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        int numerPytania = 0;
        do {
            Pytanie pytanie = pytania.get(numerPytania);
            System.out.println(pytanie.getPytanie());

            System.out.println("Dostępne odpowiedzi:");
            for (String odpowiedz : pytanie.getOdpowiedzi()) {
                System.out.println(odpowiedz);
            }

            System.out.println("Podaj swoją odpowiedź: [a, b, c, d]");
            try {
                String odp = scanner.nextLine().toUpperCase().trim();
                char litera = odp.charAt(0); // A B C D
                int indeks = litera - 65;    // 0 1 2 3
                if(indeks != pytanie.getPoprawnaOdpowiedz()){
                    System.out.println("Niepoprawna odpowiedź!");
                    ileMaŻyć--;
                }else{
                    System.out.println("Poprawna odpowiedź!");
                }
            } catch (IllegalArgumentException | IndexOutOfBoundsException ex) {
                System.out.println("Niepoprawna odpowiedź!");
                System.out.println("Pozostało Ci żyć: " + ileMaŻyć);
                ileMaŻyć--;
            }

            numerPytania++;

        } while (ileMaŻyć > 0 && numerPytania < pytania.size());
    }
}

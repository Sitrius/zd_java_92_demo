package com.sda.zd92.enumeraty;

import java.util.Scanner;

public class PizzaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wielkosc pizzy: ");
        String wielkosc = scanner.next().toUpperCase();

        RozmiarPizzy rozmiarPizzy = RozmiarPizzy.valueOf(wielkosc);
        System.out.println("Rozmiar pizzy w centymetrach: " + rozmiarPizzy.getWielkoscCM());
    }
}

package com.sda.zd92.threading.wyscigi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 0) {
                bank.wpłata(5);  // +5
            } else {
                bank.wyplata(5); // -5
            }
        }
        // spodziewamy się  =  == = = = == = => 0

        Scanner scanner = new Scanner(System.in);
        String komenda;
        boolean uruchomiony = true;
        do {
            komenda = scanner.nextLine();
            System.out.println(komenda);

            if (komenda.equalsIgnoreCase("stan")) {
                bank.getKontoBankowe().wypiszStan();
            } else if (komenda.equalsIgnoreCase("quit")) {
                System.out.println("Zamykam program.");
                uruchomiony = false;
            }
        } while (uruchomiony);

        System.out.println("Opuszczam pętlę.");
    }
}

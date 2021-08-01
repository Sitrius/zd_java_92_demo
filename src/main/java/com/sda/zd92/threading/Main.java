package com.sda.zd92.threading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 4 rdzenie = 4 zadania realizowane równolegle/jednocześnie
        // wątek:
        //  - realizowanie pewnego zadania/treści
        //  - może wystartować wiele różnych zadań (mniej lub bardziej od siebie zależnych)
        //  - żeby realizować jedno zadanie musimy "zapomnieć" poprzednie zadania

        // #################
        // ROZPOCZYNAMY WĄTEK GŁÓWNY
        // #################

        // obiekt który odpowiada za wykonywanie czynności/wątku
        // wątek musi przyjąć "coś wykonywalnego/uruchamialnego" - runnable
        Krzykacz krzykacz = new Krzykacz();
        Thread wątek = new Thread(krzykacz);
        // jeszcze nie uruchomiłem wątku!

        // PAWEŁ BĘDZIE BARDZO ZŁY JAK BĘDZIEMY PRÓBOWALI
        // URUCHOMIĆ WĄTEK METODĄ RUN!
        // Wątek startujemy metodą 'start()'
        wątek.start();
        // teraz uruchomiłem wątek

        Thread watekSprawdzajacy = new Thread(new WatekUsypianie());
        watekSprawdzajacy.start();

        Scanner scanner = new Scanner(System.in);
        String komenda;
        boolean uruchomiony = true;
        do {
            komenda = scanner.nextLine();
            System.out.println(komenda);

            if(komenda.equalsIgnoreCase("zamknij sie")) {
                System.out.println("Zamykam typa...");
                krzykacz.setKrzycze(false); // zamknij sie

            } else if (komenda.equalsIgnoreCase("quit")) {
                System.out.println("Zamykam program.");
                uruchomiony = false;
            }
        } while (uruchomiony);

        System.out.println("Opuszczam pętlę.");
    }
}

package com.sda.zd92.iterowanie;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainStringForeachArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }

        // foreach - jest zaprojektowany w taki sposób żeby tylko jedna osoba/wątek edytowała lub operowała
        //          na danej kolekcji. Sprawia to, że jeśli iterujemy, to nie możemy usuwać elementów

        // 1 kopia - będziemy iterować kopię
        // 2 iteracja + usuwanie - iterujemy kopie, usuwamy orginalne elementy z orginalnej listy
        List<String> kopia = new ArrayList<>(list);

        // mój cel to usunąć elementy o wartości 5,6,7
        for (String wartosc : kopia) {
            if (wartosc.equals("5") || wartosc.equals("6") || wartosc.equals("7")) {
                list.remove(wartosc);
            }
        }
        System.out.println(list);
    }
}

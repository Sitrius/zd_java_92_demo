package com.sda.zd92.iterowanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class MainStringForeachList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
            // Observer
        }

        // foreach - jest zaprojektowany w taki sposób żeby tylko jedna osoba/wątek edytowała lub operowała
        //          na danej kolekcji. Sprawia to, że jeśli iterujemy, to nie możemy usuwać/ani dodawać elementów

        // 1 kopia - będziemy iterować kopię
        // 2 iteracja + usuwanie - iterujemy kopie, usuwamy orginalne elementy z orginalnej listy
        String[] kopia = new String[list.size()];
        kopia = list.toArray(kopia);

        // mój cel to usunąć elementy o wartości 5,6,7
        for (String wartosc : kopia) {
            if (wartosc.equals("5") || wartosc.equals("6") || wartosc.equals("7")) {
                list.remove(wartosc);
            }
        }
        System.out.println(list);
    }
}

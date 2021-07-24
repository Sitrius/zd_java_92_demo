package com.sda.zd92.iterowanie;

import java.util.ArrayList;
import java.util.List;

public class MainStringForeachKtoryNieDziala {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
            // Observer
        }

        // foreach - jest zaprojektowany w taki sposób żeby tylko jedna osoba/wątek edytowała lub operowała
        //          na danej kolekcji. Sprawia to, że jeśli iterujemy, to nie możemy usuwać/ani dodawać elementów
        // mój cel to usunąć elementy o wartości 5,6,7
        for (String wartosc : list) {
            // tutaj bedzie bubu i nie zadziala
            // Concurrent Modification Exception
            // Współbieżna modyfikacja
            if (wartosc.equals("5") || wartosc.equals("6") || wartosc.equals("7")) {
                list.remove(wartosc);
            }
        }
        System.out.println(list);
    }
}

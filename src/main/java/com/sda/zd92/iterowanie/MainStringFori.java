package com.sda.zd92.iterowanie;

import java.util.ArrayList;
import java.util.List;

public class MainStringFori {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }

        // fori
        // mój cel to usunąć elementy o wartości 5,6,7
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("5") || list.get(i).equals("6") || list.get(i).equals("7")) {
                // teraz usuwam wartość (typ usuwany [typ obiektu usuwanego który został podany jako parametr] to Integer)
                list.remove(i);
                // żeby naprawić pętle i nie robić "przeskoków elementów" musimy zdekrementować
                // indeks `i` po usunięciu elementu.
                i = i - 1; // --i; i--;
            }
        }
        // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 <-- indeksy
        // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 <-- wartości, w kolejnych liniach podamy kolejne iteracje
        // 0 // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        // ...
        // 5 // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        // 6 // 0, 1, 2, 3, 4, X, 6, 7, 8, 9
        // 6 // 0, 1, 2, 3, 4, 6, 7, 8, 9
        // 6 // 0, 1, 2, 3, 4, 6, X, 8, 9
        // 7 // 0, 1, 2, 3, 4, 6, 8, 9
    }
}

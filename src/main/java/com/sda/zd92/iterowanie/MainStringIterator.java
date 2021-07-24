package com.sda.zd92.iterowanie;

import com.sda.zd92.enumeraty.Plec;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainStringIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
            // Observer
        }

        // UX - User Experience/Design
        // mój cel to usunąć elementy o wartości 5,6,7
        Iterator<String> iterator = list.iterator();

        // Iterator posiada dwie metody dla nas ważne
        // hasNext() - czy posiada następny element
        // next() -> przeskocz do następnego elementu i zwróć go
        while (iterator.hasNext()) { // dopóki mam następny element w kolekcji
            String wartosc = iterator.next(); // przeskocz i POBIERZ
            if (wartosc.equals("5") || wartosc.equals("6") || wartosc.equals("7")) {
                iterator.remove(); // usunięcie elementu i pozostanie w tym samym miejscu
            }
        }
        System.out.println(list);
    }
}

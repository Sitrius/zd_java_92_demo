package com.sda.zd92.iterowanie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // mój cel to usunąć elementy o wartości 5,6,7
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 5 ||
                    list.get(i) == 6 ||
                    list.get(i) == 7) {
                // teraz usuwam wartość (typ usuwany [typ obiektu usuwanego który został podany jako parametr] to Integer)
                list.remove(new Integer(i));

                // teraz usuwam indeks (typ usuwany [typ obiektu i] to int)
                list.remove(i);
            }
        }

    }
}

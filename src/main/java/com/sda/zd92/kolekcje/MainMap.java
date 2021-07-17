package com.sda.zd92.kolekcje;

import com.sda.zd92.obj.Obywatel;

import java.util.*;

public class MainMap {
    public static void main(String[] args) {
//        Mapa posiada dwa typy generyczne:
//              - Klucz   K
//              - Wartość V (Value)
//        Map<K, V>
//        List<T> = Map<Integer, T>
//        list.get(9) = map.get(9)
        Obywatel o1 = new Obywatel("111111111", "Jan", "Kowalski");
        Obywatel o2 = new Obywatel("111111112", "Marian", "Kowalski");
        Obywatel o3 = new Obywatel("111111113", "Miłosz", "Kowalski");
        Obywatel o4 = new Obywatel("111111114", "Filip", "Kowalski");
        Obywatel o5 = new Obywatel("111111115", "Grażyna", "Nowak");
        Map<String, Obywatel> map = new HashMap<>();
        map.put(o1.getPesel(), o1);
        map.put(o2.getPesel(), o2);
        map.put(o3.getPesel(), o3);
        map.put(o4.getPesel(), o4);
        map.put(o5.getPesel(), o5);

        Obywatel o = map.get("111111115"); // otrzymam obywatela o5

        Map<String, List<Obywatel>> mapaPoNazwisku = new HashMap<>();
        mapaPoNazwisku.put("Kowalski", new ArrayList<>(Arrays.asList(
                o1, o2, o3, o4
        )));

        mapaPoNazwisku.put("Nowak", new ArrayList<>(Arrays.asList(
                o5
        )));
    }
}

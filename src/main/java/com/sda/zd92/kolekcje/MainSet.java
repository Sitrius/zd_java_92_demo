package com.sda.zd92.kolekcje;

import com.sda.zd92.obj.Kot;
import com.sda.zd92.obj.Obywatel;

import java.util.*;

public class MainSet {
    public static void main(String[] args) {
        // Set jest kolekcją w której:
        //      - wszystkie elementy są unikalne
        //      - elementy są out-of-order (set nie zachowuje kolejności*)
        //      - set wykorzystuje metode equals/hashcode do porównania obiektów
        //      - nie posiada metody GET(index)
        Set<Obywatel> obywatels = new HashSet<>();

        List<Integer> integerList = new ArrayList<>(Arrays.asList(
                1, 5, 10, 50, 20, 5, 10, 50, 50, 20, 20, 1, 5, 30, 40, 50
        ));
        // Sprawdzamy unikalne elementy (ilość i jakie)
        // normalne podejście - iteracje przez listy
        //                      - tworzymy drugą listę i dodajemy do niej elementy i przed dodaniem sprawdzamy czy
        //                          takiego elementu jeszcze nie mamy

        // przerzucam elementy z listy do setu
        System.out.println("Lista: " + integerList);

        Set<Integer> unikalneElementy = new HashSet<>(integerList);
        System.out.println("Set: " + unikalneElementy);

        String s1 = "common_prefixDB";
        System.out.println("common_prefixDB".hashCode());
        String s2 = "common_prefixCa";
        System.out.println("common_prefixCa".hashCode());

        // equals i hashcode jest sprawdzany w setach
        Set<String> strings = new HashSet<>();
        strings.add(s1);
        strings.add(s2);
        System.out.println("Rozmiar: " + strings.size());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}

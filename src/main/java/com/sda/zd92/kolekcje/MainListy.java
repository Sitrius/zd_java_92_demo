package com.sda.zd92.kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MainListy {
    public static void main(String[] args) {
//        Set<Integer> list = new HashSet<>();
        // interfejs zawiera tylko i wyłącznie metody
        // interfejs mówi jak zachowuje się obiekt
        List<Integer> list = new ArrayList<>(2); //
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

//        System.out.println("Rozmiar: " + list.length <- tak było w tablicach);
        System.out.println("Rozmiar: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index: " + i + " wartość: " + list.get(i));
        }
        list.remove(2); // <- usuń obiekt pod indeksem
//        list.removeAll(Arrays.asList(0,1,3)); // <- usuń taki obiekt - czyli nic nie usunie
//        list.removeAll(Arrays.asList(10, 15, 20)); // <- usuń taki obiekt - czyli zostanie tylko (jeden obiekt) = 5

        System.out.println("Rozmiar: " + list.size()); // 3
        for (int i = 0; i < list.size(); i++) {
//            System.out.println("Index: " + i + " wartość: " + tablica[i] <- tak było w tablicach);
            System.out.println("Index: " + i + " wartość: " + list.get(i));
        }


    }
}

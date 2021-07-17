package com.sda.zd92.kolekcje;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaBenchmark {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
//        List<Integer> list = new MojaLista<>();
        dodajDoListyNElementow(list, 1000000);


        long start = System.currentTimeMillis();
        przeszukajListe(list);
        long stop = System.currentTimeMillis();


        System.out.println("Pomiar czasu : " + (stop-start));
    }

    private static void przeszukajListe(List<Integer> list) {
        int zmienna = 0;
        for (int i = 0; i < list.size(); i++) {
            // n  - arraylist
            // n! - linkedlist
            zmienna = list.get(i);
        }
    }

    private static void dodajDoListyNElementow(List<Integer> list, int liczbaElementow) {
        for (int i = 0; i < liczbaElementow; i++) {
            list.add(i);
        }
    }


}

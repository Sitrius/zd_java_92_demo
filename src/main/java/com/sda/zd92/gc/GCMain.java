package com.sda.zd92.gc;

import java.util.ArrayList;
import java.util.List;

public class GCMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        uspij();

        dodajElementy(integerList);
        dodajElementy(integerList);
        uspij();

        usunElementy(integerList);

        uspij();
        Runtime.getRuntime().gc();


        dodajElementy(integerList);
        uspij();

        usunElementy(integerList);

        uspij();

        dodajElementy(integerList);
    }

    private static void dodajElementy(List<Integer> integerList) {
        for (int i = 0; i < 1000000; i++) {
            integerList.add(i);
        }
    }

    private static void usunElementy(List<Integer> integerList) {
        for (int i = 0; i < 1000000; i++) {
            integerList.remove(integerList.size() - 1);
        }
    }

    private static void uspij() {
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

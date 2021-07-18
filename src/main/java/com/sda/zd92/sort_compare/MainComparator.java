package com.sda.zd92.sort_compare;

import com.sda.zd92.obj.Obywatel;

import java.util.*;

public class MainComparator {
    public static void main(String[] args) {
        Obywatel o1 = new Obywatel("111111111", "Jan", "Kowalski");
        Obywatel o2 = new Obywatel("111111112", "Marian", "Kowalski");
        Obywatel o3 = new Obywatel("111111113", "Miłosz", "Kowalski");
        Obywatel o4 = new Obywatel("111111114", "Filip", "Kowalski");
        Obywatel o5 = new Obywatel("111111115", "Grażyna", "Nowak");

//        ###################### LISTY I ICH SORTOWANIE
        List<Obywatel> obywatels = new ArrayList<>(Arrays.asList(o1, o2, o3, o4, o5));
//        System.out.println("Przed: " + obywatels);
//        PorownywarkaObywateli porownywarkaObywateli = new PorownywarkaObywateli();
//        obywatels.sort(porownywarkaObywateli);
//        System.out.println("Po: " + obywatels);
//        ###################### LISTY I ICH SORTOWANIE

//        ###################### SETY I ICH SORTOWANIE
        Set<Obywatel> obywatelSet = new TreeSet<>(new PorownywarkaObywateli());
        obywatelSet.add(o1);
        obywatelSet.add(o2);
        obywatelSet.add(o3);
        obywatelSet.add(o4);
        obywatelSet.add(o5);

//        Nie da się iterować setu pętlą fori
//        for (int i = 0; i < ; i++) {
//            ??
//        }

//        Pętla foreach - dla każdego obiektu obywatel wewnątrz zbioru obywatelSet
        for (Obywatel obywatel : obywatelSet) {
            System.out.println(obywatel);
        }

//        ###################### MAPY I ICH SORTOWANIE
//                                                          Klasa anonimowa
//                                                          Stworzyłem obiekt z interfejsu
//                                                          Nie nadałem nazwy klasie która implementuje interfejs
//                                                              tylko stworzyłem implementację interfejsu in-line
        Map<String, Obywatel> obywatelMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        obywatelMap.put(o1.getImie(), o1);
        obywatelMap.put(o2.getImie(), o2);
        obywatelMap.put(o3.getImie(), o3);
        obywatelMap.put(o4.getImie(), o4);
        obywatelMap.put(o5.getImie(), o5);

//        Sprawdzenie czy istnieje klucz
        obywatelMap.containsKey("Jan");

//        Sprawdzenie czy istnieje wartość
//        obywatelMap.containsValue(/*...*/);

//        Iterowanie kluczy
        for (String klucz : obywatelMap.keySet()) {
            System.out.println(klucz);
        }

//        Iterowanie wartości
        for (Obywatel obywatel : obywatelMap.values()) {
            System.out.println(obywatel);
        }

//        Iterowanie par Klucz-Wartość
        for (Map.Entry<String, Obywatel> wpisWMapie : obywatelMap.entrySet()) {
            System.out.println("Klucz: " + wpisWMapie.getKey() + " wartość: " + wpisWMapie.getValue());
        }

    }
}

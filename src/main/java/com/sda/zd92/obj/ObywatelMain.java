package com.sda.zd92.obj;

import java.util.HashSet;
import java.util.Set;

public class ObywatelMain {
    public static void main(String[] args) {

        Obywatel j1 = new Obywatel("9", "Marek", "Kowalski");
        Obywatel j2 = new Obywatel("9", "Adam", "Kowalski");
        System.out.println("-----");
        System.out.println(j1.equals(j2)); // true
        System.out.println(j1.hashCode());
        System.out.println(j2.hashCode());
        System.out.println("-----");


        Obywatel o1 = new Obywatel("92");
        Obywatel o2 = new Obywatel("93");
        Obywatel o3 = new Obywatel("92");
        System.out.println("----------");
        System.out.println(o1.equals(o2)); // oczekuje że otrzymam false
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o3.hashCode());
        System.out.println("----------");
        // w tym momencie metoda equals porównuje zawartość klasy
        System.out.println(o1.equals(o3)); // oczekuje że otrzymam true

        // -- Jak brzmi niewiązany/nieformalny kontrakt między equals i hashcode?
        // metoda equals musi zawsze zwrócić wynik porównania obiektów
        // jeśli obiekty są takie same to MUSZĄ MIEC TEN SAM HASHCODE
        // jeśli hashcode jest taki sam to equals nie musi dawać wyniku true
        // obiekty mogą mieć ten sam hashcode ale nie być sobie równe

        // hash code to metoda która generuje z wartości pól quasi-losową wartość
        Set<Integer> set = new HashSet<>();
        // gwarantuje że elementy w środku są unikalne
        // 100
        // 1
        // obiekt -> 13
        // tab[13] -> obiekt
        // + obiekt2 -> 13
        // tab[13] ?

        // common_prefixDB
        String s1 = "common_prefixDB";
        String s2 = "common_prefixCa";
        System.out.println("common_prefixDB");
        System.out.println("common_prefixDB".hashCode());
        System.out.println("common_prefixCa");
        System.out.println("common_prefixCa".hashCode());
        System.out.println(s1.equals(s2)); // ? = false - porównało wartości obiektów, czyli treść tekstową

        System.out.println("---------------");
        Integer i1 = new Integer(5);
        Integer i2 = new Integer(10);
        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
        // 4 * 1 = 4
        // 2 * 2 = 4
    }
}

package com.sda.zd92;

import com.sda.zd92.obj.Kot;

public class Main {

    public static void main(String[] args) {
        Kot kot1 = new Kot("Jan");
        Kot kot2 = new Kot("Jan");
        // jeśli nie nadpiszemy metody "toString" to wypisuje się hashcode - który (jeśli nie jest nadpisany)
        // jest adresem obiektu w pamięci

//        System.out.println(kot.toString());
        System.out.println(kot1);
        System.out.println(kot1 == kot2); // false

        kot1 = kot2;
        System.out.println(kot1 == kot2); // true

        // == - przyrównanie które porównuje :
        //          - w typach prymitywnych ich wartości
        //          - w typach złożonych ich adresy/referencje (miejsce w pamięci)

        // equals (jeśli nie nadpisana to porównuje referencje - działa tak jak '==' )
        // hashCode
        Kot kot3 = new Kot("Jan");
        Kot kot4 = new Kot("Jan");
        String a = new String("jan");
        String b = new String("jan");
        System.out.println(a.equals(b)); // true

        System.out.println(kot3.equals(kot4)); // porównuje = false
        kot3 = kot4;
        System.out.println(kot3.equals(kot4)); // porównuje = true


    }
}

package com.sda.zd92.obj;

import java.util.Objects;

public class Kot /*extends Object*/{
    // Każda klasa niejawnie dziedziczy po klasie Object
    private String imie;

    public Kot(String imie) {
        this.imie = imie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kot kot = (Kot) o;
        return Objects.equals(imie, kot.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie);
    }
//                  haschode int'a to jego wartość
//                  2*5 = 10  =  10
//                                                  ------- (obiekt porównywany)
//                                                  (dzialanie A)  ->   = 10    (hashcode)
//                                                  (działanie B)  ->   = 10    (hashcode)
//
//
    @Override
    public String toString() {
        return "Kot{" +
                "imie='" + imie + '\'' +
                '}';
    }
}

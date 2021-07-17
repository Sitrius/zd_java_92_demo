package com.sda.zd92.obj;

import java.util.Objects;

public class Obywatel {
    private String pesel;
    private String imie;
    private String nazwisko;

    public Obywatel(String pesel) {
        this.pesel = pesel;
    }

    public Obywatel(String pesel, String imie, String nazwisko) {
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Obywatel obywatel = (Obywatel) o;
//        return Objects.equals(pesel, obywatel.pesel);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(pesel);
//    }

    public void przedstawSie(){
        System.out.println("Siema, jestem jarek!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obywatel obywatel = (Obywatel) o;
        return Objects.equals(pesel, obywatel.pesel) && Objects.equals(nazwisko, obywatel.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel, nazwisko);
    }
}

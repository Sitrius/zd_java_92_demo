package com.sda.zd92.gc;

public class Main {
    public static void main(String[] args) {
        String tekst = "Pawel ma kota";

        wypiszIWytnijTekst(tekst);
    }

    private static void wypiszIWytnijTekst(String tekst) {
        String wyciety = wytnij(tekst);
        wypisz(wyciety);
        // czy b żyje tutaj?
    }

    private static void wypisz(String wyciety) {
        System.out.println(wyciety.charAt(15));
    }

    private static String wytnij(String tekst) {
        int a = 5;
        return tekst.substring(a); // 5^ = ' ma kota'
    }
}

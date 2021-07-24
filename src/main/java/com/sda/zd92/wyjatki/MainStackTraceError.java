package com.sda.zd92.wyjatki;

public class MainStackTraceError {
    public static void main(String[] args) {
        metoda();
    }

    private static void metoda() {
        metoda();
    }
}

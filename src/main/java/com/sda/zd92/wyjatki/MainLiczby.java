package com.sda.zd92.wyjatki;

public class MainLiczby {
    public static void main(String[] args) {
        int dzielna = 10;
        int dzielnik = 0;

        try {
            int wynik = dzielna / dzielnik;
            System.out.println(wynik);
        }catch (ArithmeticException ae){
            System.err.println("Dzielenie przez 0");
        }
    }
}

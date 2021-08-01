package com.sda.zd92.palindrom;

import java.util.Scanner;

public class MainPalindrom {
    // Have the function Palindrome(str) take the str parameter being passed and return the
    // string true if the parameter is a palindrome,
    // (the string is the same forward as it is backward) otherwise return the string false.
    // For example: "racecar" is also "racecar" backwards. Punctuation and numbers will not be part of the string.
    public static boolean Palindrome(String str) {
        // code goes here
        int dlugosc = str.length();

        char[] znaki = str.toCharArray();
        int odPrzodu = 0;
        int odTylu = dlugosc - 1;

        while (odPrzodu <= odTylu) {
            while (znaki[odPrzodu] == ' ') {
                odPrzodu++;
            }
            while (znaki[odTylu] == ' ') {
                odTylu--;
            }
            if (znaki[odPrzodu] != znaki[odTylu]) {
                return false;
            }
            odTylu--;
            odPrzodu++;
        }
        return true;
    }

    public static boolean Palindrome2(String str) {
        // code goes here
        int dlugosc = str.length();

        // zamiana wszystkich spacji, wtedy mamy tylko symetryczny ciąg znaków
        str = str.replaceAll(" ", "");

        // iterujemy do połowy, tyle nam wystarczy
        for (int i = 0; i < (dlugosc / 2); i++) {
            // porównujemy jeden element od początku (charAt(i)) z elementem
            // porównujemy jeden element od końca    (charAt(dlugosc - 1 - i))

            // i sprawia że pętla idzie do przodu od początku
            // i sprawia że pętla idzie do tyłu od końca (dlugosc - i)

            // ponieważ elementy iterowane są od 0, to ostatni znak jest tak na prawde na indeksie (dlugosc - 1)
            if (str.charAt(i) != str.charAt(dlugosc - 1 - i)) {
                // jeśli jakikolwiek znak nie pasuje, zwracamy false
                return false;
            }
        }

        // jeśli udało się wrócić i nie znaleźć niepasujących liter - wracamy z true.
        return true;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println(Palindrome2("never odd or even"));
        System.out.println(Palindrome2("eye"));
        System.out.println(Palindrome2("taco cat"));
    }
}

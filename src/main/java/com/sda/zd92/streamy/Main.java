package com.sda.zd92.streamy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i + 1000);
        }

        Long startTimeF = System.currentTimeMillis();
        List<Integer> wynikF = znajdzLiczbyParzysteFor(integerList);
        Long stopTimeF = System.currentTimeMillis();
        System.out.println(wynikF);

        Long startTimeS = System.currentTimeMillis();
        List<Integer> wynikS = znajdzLiczbyParzysteStream(integerList);
        Long stopTimeS = System.currentTimeMillis();
        System.out.println(wynikS);

        System.out.println("Czas For:" + (stopTimeF - startTimeF) + " Stream: " + (stopTimeS - startTimeS));
    }

    private static List<Integer> znajdzLiczbyParzysteFor(List<Integer> integerList) {
        List<Integer> wynik = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 2 == 0) {
                wynik.add(integerList.get(i));
            }
        }
        return wynik;
    }

    // 0 1 2 3 4 5 6 7 ->
    //                  sequential processing
    //                  przetwarzanie sekwencyjne
    private static List<Integer> znajdzLiczbyParzysteStream(List<Integer> integerList) {
        return integerList.stream()
                // filter to element strumienia który pozwala filtrować i odsiewać elementy które nie spełniają predykatu
                .filter(new Predicate<Integer>() {
                    // klasa anonimowa z interfejsu
                    // uzupełniamy funkcję TEST
                    // wynik true -> obiekt przechodzi dalej do przetwarzania
                    // wynik false-> obiekt jest usuwany ze streamu
                    @Override
                    public boolean test(Integer obiektWStrumieniu) {
//                        if (obiektWStrumieniu % 2 == 0) {
//                            return true;
//                        } else {
//                            return false;
//                        }
                        return (obiektWStrumieniu % 2 == 0);
                    }
                })
                // collect jest ELEMENTEM KOŃCOWYM - zbiera elementy do wybranych kolekcji.
//                .collect(Collectors.toSet()); - alternatywa to set
                .collect(Collectors.toList());
    }

    // usunięte komentarze
    private static List<Integer> znajdzLiczbyParzysteStreamKrotki1(List<Integer> integerList) {
        return integerList.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer obiektWStrumieniu) {
                        return (obiektWStrumieniu % 2 == 0);
                    }
                })
                .collect(Collectors.toList());
    }

    // zamieniam obiekt na skrócony zapis
    private static List<Integer> znajdzLiczbyParzysteStreamKrotki2(List<Integer> integerList) {
        return integerList.stream()
                // wyrażenie lambda = skrócony zapis
                .filter((obiektWStrumieniu) -> {
                    return (obiektWStrumieniu % 2 == 0);
                })
                .collect(Collectors.toList());
    }

    // zamieniam obiekt na skrócony zapis bez klamerek
    private static List<Integer> znajdzLiczbyParzysteStreamKrotki3(List<Integer> integerList) {
        return integerList.stream()
                // wyrażenie lambda = skrócony zapis bez klamerek
                .filter(obiektWStrumieniu -> (obiektWStrumieniu % 2 == 0))
                .collect(Collectors.toList());
    }

}

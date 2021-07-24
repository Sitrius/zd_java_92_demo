package com.sda.zd92.streamy;

import java.util.*;
import java.util.stream.Collectors;

public class MainStreamElementy {
    public static void main(String[] args) {
        List<Telefon> telefons = new ArrayList<>(Arrays.asList(
                new Telefon( "seiugseig", 13.0, 8.0, OS.WINDOWSPHONE, Arrays.asList("czesc synku", "co tam u Ciebie?", "Pozdrawiam, mama")),
                new Telefon("3wuihr3w3", 13.0, 7.0, OS.OSX, Arrays.asList("Hej tu Asia!", "co tam u Ciebie?", "Pozdrawiam, mama")),
                new Telefon("34tc3cc34", 11.0, 4.5, OS.WINDOWSPHONE, Arrays.asList("Co tam marek?", "co tam u Ciebie?", "Pozdrawiam, mama")),
                new Telefon("seiugseig", 13.0, 8.0, OS.WINDOWSPHONE, Arrays.asList("Kocham Cie, mamusia!", "co tam u Ciebie?", "Pozdrawiam, mama")),
                new Telefon("2vu829v8q", 13.0, 5.0, OS.OSX, Arrays.asList("Tu twój operator...", "co tam u Ciebie?", "Pozdrawiam, mama")),
                new Telefon("skejghdir", 13.0, 5.0, OS.ANDROID, Arrays.asList("Tu twój operator...", "co tam u Ciebie?", "Pozdrawiam, mama")),
                new Telefon("9843ut938", 15.0, 8.5, OS.ANDROID, Arrays.asList("czesc synku", "co tam u Ciebie?", "Pozdrawiam, mama")),
                new Telefon("i4ugwhiga", 12.0, 4.0, OS.ANDROID, Arrays.asList("czesc synku", "co tam u Ciebie?", "Pozdrawiam, mama")),
                new Telefon("seiugseig", 13.0, 8.0, OS.WINDOWSPHONE, Arrays.asList("czesc synku", "co tam u Ciebie?", "Pozdrawiam, mama"))
        ));

        // tylko telefony z systemem OSX
        List<Telefon> tylkoOsx = telefons
                .stream()
                .filter(telefon -> telefon.getSystem() == OS.OSX)
                .collect(Collectors.toList());
        System.out.println("Telefony osx: " + tylkoOsx);
        System.out.println();

        // Zmapowanie to znaczy przetworzenie strumienia obiektów typu X na typ Y
        // interesuje mnie jakie numery seryjne posiadają te telefony = w wyniku potrzebuje listy numerów seryjnych
//        List<String> numerySeryjne = telefons.stream().map(telefon -> telefon.getNumerSeryjny()).collect(Collectors.toList());
        List<String> numerySeryjne = telefons
                .stream()
                .map(Telefon::getNumerSeryjny)
                .collect(Collectors.toList());
        System.out.println("Telefony numery ser: " + numerySeryjne);
        System.out.println();

//        Używając comparatora
//        List<Telefon> sortowaneWielkoscia = telefons.stream().sorted((t1, t2) -> {
//            return Double.compare(t1.getPowierzchnia(), t2.getPowierzchnia());
//        }).collect(Collectors.toList());
        List<Telefon> sortowaneWielkoscia = telefons
                .stream()
                .sorted(Comparator.comparingDouble(Telefon::getPowierzchnia))
                .collect(Collectors.toList());
        System.out.println("Telefony sortowane po pow.:: " + sortowaneWielkoscia);
        System.out.println();

        List<Telefon> unikalne = telefons
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Telefony unikalne: " + unikalne);
        System.out.println();

        // przetwarzające
        //  - filter    - filtruje
        //  - map       - mapuje
        //  - sort      - sortuje
        //  - distinct  - usuwa duplikaty
        // ##################################################################################

        Optional<Telefon> optionalTelefon1 = telefons.stream()
//                .parallel() // równolegle
                .filter(telefon -> telefon.getSystem() == OS.WINDOWSPHONE)
                .filter(telefon -> telefon.getPowierzchnia() > 90.0)
                .findFirst();
        System.out.println(optionalTelefon1);
        if (optionalTelefon1.isPresent()) {
            Telefon telefon = optionalTelefon1.get();       //  wydobyć (get)
            System.out.println("Znaleziono2: " + telefon);
        }

        // jeśli znalazłeś - wydobądź i wypisz
//        optionalTelefon1.ifPresent(telefon -> System.out.println(telefon));
        optionalTelefon1.ifPresent(System.out::println);

        Optional<Telefon> optionalTelefon2 = telefons.stream()
//                .parallel() // równolegle
                .filter(telefon -> telefon.getSystem() == OS.OSX)
                .filter(telefon -> telefon.getPowierzchnia() > 10000.0)
                .findFirst();
        System.out.println(optionalTelefon2);
        if (optionalTelefon2.isPresent()) {
            Telefon telefon = optionalTelefon2.get();       //  wydobyć (get)
            System.out.println("Znaleziono2: " + telefon);
        }
        // znajdź telefon (wyżej) i go wydoboądź (linia niżej) jeśli go nie znajdziesz (orElse), to stwórz nowy
        Telefon t = optionalTelefon2.orElse(new Telefon());
        System.out.println("Nowy lub znaleziony: " + t);

        // czy istnieje jakikolwiek telefon o takich parametrach:
//        boolean czyIstniejeJakikolwiekTelefon = telefons.stream()
//                .anyMatch(telefon -> telefon.getPowierzchnia() > 1000 && telefon.getSystem() == OS.OSX);

        // zebranie tych elementów:
        List<Telefon> czyIstniejeJakikolwiekTelefon = telefons.stream()
                .filter(telefon -> telefon.getPowierzchnia() > 1000 && telefon.getSystem() == OS.OSX)
                .collect(Collectors.toList());

        // końcowe
        //  - collect
        //  - find first
        //  - find any
        // ##################################################################################

        // suma wysokości wszystkich telefonów:
        // map To Double -> powoduje że zamiast Stream<Object> -> StreamInt StreamDouble
        // streamDouble posiada metody matematyczne
        double sum = telefons.stream()
                .mapToDouble(telefon -> telefon.getWysokosc())
                .sum();

        // OptionalDouble to Optional<Double> tylko specyficzna klasa
//        Optional<Double> average = telefons.stream()
        OptionalDouble average = telefons.stream()
                .mapToDouble(telefon -> telefon.getWysokosc())
                .average();

        OptionalDouble min = telefons.stream()
                .mapToDouble(telefon -> telefon.getWysokosc())
                .min();

        OptionalDouble max = telefons.stream()
                .mapToDouble(telefon -> telefon.getWysokosc())
                .max();

        long iloscElementow = telefons.stream()
                .mapToDouble(telefon -> telefon.getWysokosc())
                .count();

        // końcowe specyficzne
        //  - sum
        //  - max
        //  - min
        //  - average
        //  - ...

//        Chcę z listy telefonów które zawierają listę smsów (innymi słowy lista - list) zrobić listę sms-sów
//        zamieniamy (stream of stream) na (stream) == spłaszczamy strukturę

        List<String> smsy = telefons.stream()
                .flatMap(telefon -> telefon.getWiadomosci().stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Lista wiadomości: " + smsy);

    }


    // Tony Hoare - algorytmy matematyczne
//    public static void main(String[] args) {
//        Integer wynikFunkcji = funkcja();
//        wykonajObliczenieNaDouble(wynikFunkcji);
//    }

    //    public static void wykonajObliczenieNaDouble(Integer dane) {
//        // NULL POINTER EXCEPTION
//        if (dane == null) {
//            return;
//        }
//        double wartoscDouble = dane.doubleValue();
//        // ...
//    }
//
//    // boki trójkąta = 1 1 1000000
//    public static Integer funkcja() {
//        // -1 = poprawny wynik
//        //  0 = poprawny wynik
//        return null;
//    }


//    public static void main(String[] args) {
//         //tony poprawiony
//
//        Optional<Integer> wynikFunkcji = funkcja();
//        if(wynikFunkcji.isPresent()) {
//            wykonajObliczenieNaDouble(wynikFunkcji.get());
//        }
//        wynikFunkcji.ifPresent(wynik -> wykonajObliczenieNaDouble(wynik));
//    }

    public static void wykonajObliczenieNaDouble(Integer dane) {
        // NULL POINTER EXCEPTION
        if (dane == null) {
            return;
        }
        double wartoscDouble = dane.doubleValue();
        // ...
    }

    // boki trójkąta = 1 1 1000000
    public static Optional<Integer> funkcja() {
        // -1 = poprawny wynik
        //  0 = poprawny wynik

        // NIE MA SLOWKA NEW
        return Optional.empty();
    }
}

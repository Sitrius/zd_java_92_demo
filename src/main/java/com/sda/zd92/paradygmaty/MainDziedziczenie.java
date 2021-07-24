package com.sda.zd92.paradygmaty;

public class MainDziedziczenie {
    // Definicja Paradygmatu dziedziczenie:
    // OOP
    // 1. Jeśli to możliwe i widzimy wspólne zachowanie pomiędzy pewnymi obiektami lub wspólne cechy (pola) to
    //      możemy stworzyć warstwę abstrakcji na poziomie wyższym i powinniśmy wspólną implementację
    //      wydobyć "wyżej" do klasy nadrzędnej.
    //
    //
    //
    //
    // Dziedziczenie definicja - pozwala tworzyć podklasy wykorzystujące część implementacji
    // Klasa (Class) -
    // Interfejs     -

    // KlasaA dziedziczy inną klasę KlasaB
    // KlasaA implementuje interfejs InterfA
    // InterfA dziedziczy interfejs InterfB

    // Jeśli mówimy że coś implementuje "coś innego" to znaczy że zawiera implementację końcową

    interface InterfA {
        // 1. Interfejsy mają metody bez implementacji (*)
        // 2. Interfejsy mają wszystkie metody publiczne
        // 3. Interfejsy nie mogą mieć pól (*)
        // 4. Interfejsy mogą mieć pola statyczne i finalne (tzw. do stałych / constants)
        // 5. Interfejsy mogą mieć metody z implementacją (patrz, łamię zasade 1) (** - java 8)
        // 6. Ile razy można implementować interfejsy? - implementować można nieskończenie wiele interfejsów
        public static final double PI = 3.14;

        // w domyśle wszystkie pola są public static final
        /*public static final*/ double MILE_TO_KM = 1.52;

        public abstract void metoda();

        public abstract int innaMetoda();

        // dopisanie słowa default powoduje że możemy nadać implemetację metodzie
        public default double podajWartoscPI() {
            return PI;
        }
    }

    // Intefejsy się rozszerzają; nie implementują
    interface InterfB extends InterfA {
    }

    //    abstract class KlasaAbstrakcyjnaPojazd implements InterfA, InterfB{ // <- możemy implementować niesk. wiele interf.
    static abstract class KlasaAbstrakcyjnaPojazd {
        // 1. Z definicji klasa abstrakcyjna jest NIEKOMPLETNA - zawiera metody abstrakcyjne (bez implementacji)
        // 2. Klasa abstrakcyjna może mieć pola (nie są statyczne)
        // 3. Pola się dziedziczą
        // 4. Metody się dziedziczą
        // 5. Dziedziczyć można: tylko raz
        private int ilośćKół;
        private double predkosc;

        public KlasaAbstrakcyjnaPojazd(int ilośćKół, double predkosc) {
            this.ilośćKół = ilośćKół;
            this.predkosc = predkosc;
            System.out.println("La la la");
        }

        public double podajPredkosc() {
            return predkosc;
        }

        // abstract powoduje że możemy napisać metodę abstrakcyjną
        // abstract sprawia że metoda nie ma implementacji (jak interfejs)
        public abstract void przyspiesz();

        public abstract void zwolnij();
    }

    public static void main(String[] args) {
        Samochód s = new Samochód();
        Rower r = new Rower();
        // lalala
        // tratata
                                                                // implementacja interfejsu
                                                                // klasa anonimowa
        InterfA jakisObiektKtoregoStworzycNiePowinienemMóc = new InterfA() {
            @Override
            public void metoda() {

            }

            @Override
            public int innaMetoda() {
                return 0;
            }
        };
    }

    static class Samochód extends KlasaAbstrakcyjnaPojazd {
        public Samochód() {
            super(4, 0);
            System.out.println("Tratata");
        }

        @Override
        public void przyspiesz() {

        }

        @Override
        public void zwolnij() {

        }
    }

    static class Rower extends KlasaAbstrakcyjnaPojazd {
        public Rower() {
            super(2, 0);
        }

        @Override
        public void przyspiesz() {

        }

        @Override
        public void zwolnij() {

        }
    }

}

package com.sda.zd92.modelowanie;

import java.util.List;
import java.util.Map;

public class Modele_rachunekSklep {
    // Sprzedajemy produkty
    // Chcę mieć możliwość sprzedawania i drukowania rachunków
    //      Rachunek zawiera ilość i rodzaj produktu

    class Produkt {
        private String nazwa;
        private double cena;
    }

    class Sklep {
        Map<String, Produkt> produkty; // Nazwa -> produkt
        private List<IloscProduktu> koszyk;

        public void dodajProduktDoKoszyka(int ilosc, Produkt produkt){

        }
    }

    class IloscProduktu {
        private double ilosc;
        private String jednostka;
        private Produkt produkt;
    }

    class Rachunek {
        private List<IloscProduktu> produkty;

        public double suma() {
            double suma = 0.0;
            for (IloscProduktu iloscProduktu : produkty) {
                // przeliczenie ceny produktu * ilość aby określić wartość która dodawana jest do sumy
                suma += iloscProduktu.ilosc * iloscProduktu.produkt.cena;
            }
            return suma;
        }
    }
}

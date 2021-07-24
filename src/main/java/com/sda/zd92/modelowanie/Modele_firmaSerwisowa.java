package com.sda.zd92.modelowanie;

import java.util.List;
import java.util.Map;

public class Modele_firmaSerwisowa {
    // klient
    // produkt
    // naprawiamy

    class Klient {
        private Long id;
        private String imie;
        private String nazwisko;

        private List<ZgłoszenieSerwisowe> zgłoszeniaSerwisowe;
    }

    class ZgłoszenieSerwisowe {
        private String identyfikator;
        private Produkt produkt;
        private boolean serwisGwarancyjny;
        private String status;
        private String opisUsterki;

        private Rachunek rachunek;
    }

    class Rachunek {
        // ... faktura
        // ...
        private double kwota;
    }

    class Produkt {
        private String nazwa;
        private String numerSeryjny;
    }

    class Serwis {
        // klientów
        // zgłoszenia
        private List<ZgłoszenieSerwisowe> zgłoszeniaSerwisowe;
        private List<Klient> klients;

//        private Map<Klient, ZgłoszenieSerwisowe> klientZgłoszenieSerwisowe;
//        private Map<String, ZgłoszenieSerwisowe> zgloszenia;
//        private Map<String, Klient> klientMap;
    }
}

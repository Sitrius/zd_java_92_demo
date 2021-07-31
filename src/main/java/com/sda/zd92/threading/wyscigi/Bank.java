package com.sda.zd92.threading.wyscigi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank {
    // Thread jest stworzony żeby realizować zadanie które jest czasochłonne
    // nie opłaca się zaczynać wątku dla dupereli (małej operacji)

    // wątek który ma realizować wiele małych zadań najlepiej by był wystartowany raz
    // i kolejno realizował swoje zadania (wyciągając je z kolejki)
//    private Thread watek = new Thread();

    // tworzymy wątek do wykonywania wielu drobnych zadań = 1 wątek
//    private ExecutorService executor = Executors.newSingleThreadExecutor();

    // tworzymy wątek do wykonywania wielu drobnych zadań = 5 wątek
    private ExecutorService executor = Executors.newFixedThreadPool(5);
    private KontoBankowe kontoBankowe = new KontoBankowe();

    public void wpłata(double kwota){
        // przekaż do realizacji zadanie przelewu wpłata
        executor.submit(new OperacjaBankowa(TypOperacji.WPLATA_NA_KONTO, kwota, kontoBankowe));
    }

    public void wyplata(double kwota){
        // przekaż do realizacji zadanie przelewu wypłata
        executor.submit(new OperacjaBankowa(TypOperacji.WYPLATA_Z_KONTA, kwota, kontoBankowe));
    }

    public KontoBankowe getKontoBankowe() {
        return kontoBankowe;
    }
}

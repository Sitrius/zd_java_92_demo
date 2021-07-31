package com.sda.zd92.threading.wyscigi;

public class KontoBankowe {
    private final Object lock = new Object();
    private Double stanKonta;


    public KontoBankowe() {
        this.stanKonta = 0.0;
    }

    public void wplata(double kwota) {
        // sekcja krytyczna
        // zjawisko wyścigów
        // nakładamy synchronizację (mutex)
        synchronized (lock) {
            this.stanKonta += kwota;
        }
    }

    public void wyplata(double kwota) {
        // sekcja krytyczna
        // zjawisko wyścigów
        // nakładamy synchronizację (mutex)
        synchronized (lock) {
            this.stanKonta -= kwota;
        }
    }

    public void wypiszStan(){
        System.out.println("Stan : " + stanKonta);
    }
}

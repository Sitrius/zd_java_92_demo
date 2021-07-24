package com.sda.zd92.enumeraty;

public enum RozmiarPizzy {
    MALA(20),           // MALA = new RozmiarPizzy(20)
    DUZA(30),           // DUZA = new RozmiarPizzy(30)
    MAXI(38),           // MAXI = new RozmiarPizzy(38)
    FAMILY(45),         // FAMILY = new RozmiarPizzy(45)
    IT_GUY(55);         // IT_GUY = new RozmiarPizzy(55)
    // Enum to konkretne instancje klasy - mamy ograniczoną ilość obiektów

    // jeśli dopiszemy final do pola, to nie ma możliwości wygenerowania settera.
    private final int wielkoscCM;

    RozmiarPizzy(int wielkoscCM) {
        this.wielkoscCM = wielkoscCM;
    }

    // getter żeby móc wydobyć wartość z konkretnego enuma.
    public int getWielkoscCM() {
        return wielkoscCM;
    }
}

// if ( pizza.getRozmiar() == MALA ) {
//      ....
// }

package com.sda.zd92.paradygmaty;

import com.sda.zd92.paradygmaty.polimorfizm.Bocian;
import com.sda.zd92.paradygmaty.polimorfizm.Kukułka;
import com.sda.zd92.paradygmaty.polimorfizm.Ptak;
import com.sda.zd92.paradygmaty.polimorfizm.Sowa;

import java.util.ArrayList;
import java.util.List;

public class MainPolimorfizm {
    // Polimorfizm
    //
    // Poli = wielo
    // Morfizm = postaciowość
    //
    //
    // 1. wielopostaciowość metod
    // 2. polimorfizm obiektów -Zachowanie obiektu nie jest zależne od typu po lewj tylko od rodzaju obiektu/referencji po prawej
    // 3. Po lewej stronie deklaracji zawsze piszemy klasę nadrzędną która dalej pozwoli nam realizować naszą funckjonaln.

    public static void main(String[] args) {
        List<Ptak> p = new ArrayList<>();
        p.add(new Kukułka());
        p.add(new Sowa());
        p.add(new Sowa());
        p.add(new Ptak());
        p.add(new Bocian());
        p.add(new Kukułka());
        p.add(new Sowa());

        for (int i = 0; i < p.size(); i++) {
            p.get(i).spiewaj();
        }
    }
}

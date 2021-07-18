package com.sda.zd92.paradygmaty.polimorfizm;

public class Kukułka extends Ptak {
    @Override
    public void spiewaj() {
        System.out.println("ku ku");
    }

    public void spiewaj(String spiew) {
        System.out.println("Spiewam: " + spiew);
    }
}

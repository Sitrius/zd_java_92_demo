package com.sda.zd92.paradygmaty.polimorfizm;

public class Main {
    public static void main(String[] args) {
        // Zachowanie obiektu nie jest zależne od typu po lewj
        // tylko od rodzaju obiektu/referencji po prawej
        Ptak p = new Kukułka();
        p.spiewaj(); // ku ku
    }
}

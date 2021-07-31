package com.sda.zd92.threading.wyscigi;

public class OperacjaBankowa implements Runnable{
    private TypOperacji typOperacji;
    private double kwota;
    private KontoBankowe konto;

    public OperacjaBankowa(TypOperacji typOperacji, double kwota, KontoBankowe konto) {
        this.typOperacji = typOperacji;
        this.kwota = kwota;
        this.konto = konto;
    }

    @Override
    public void run() {
        if (typOperacji == TypOperacji.WPLATA_NA_KONTO){
            konto.wplata(kwota);
            // wpłacenie
        }else if(typOperacji == TypOperacji.WYPLATA_Z_KONTA){
            konto.wyplata(kwota);
            // wypłacenie
        }
    }
}

package com.sda.zd92.threading;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class WatekUsypianie implements Runnable{

    private boolean praca;

    public WatekUsypianie() {
        this.praca = true;
    }

    @Override
    public void run() {
        long wielkoscPliku = 0;
        while (praca){
            // bez uśpienia taki wątek zabierze jeden pełny rdzeń - 100% procesora
            try {
                TimeUnit.NANOSECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            File f = new File("pytania.txt");
            if(f.length() != wielkoscPliku){
                System.out.println("Wielkosc pliku sie zmienila, wynosi teraz: " + f.length());
                wielkoscPliku = f.length();
            }
        }
    }

    public void setPraca(boolean praca) {
        this.praca = praca;
    }
}

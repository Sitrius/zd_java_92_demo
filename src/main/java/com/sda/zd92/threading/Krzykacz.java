package com.sda.zd92.threading;

import lombok.Setter;

public class Krzykacz implements Runnable{
    private boolean krzycze;

    public Krzykacz() {
        this.krzycze = true;
    }

    public void setKrzycze(boolean krzycze) {
        this.krzycze = krzycze;
    }

    @Override
    public void run() {
        System.out.println("Uruchamiam wątek");

        for (int i = 0; i < 100; i++) {
            // jeśli komuś uda się zmienić wartość krzycze = false to krzykacz się zamknie
            if(!krzycze){
                break;
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // odstęp 100 ms

            System.out.println("Aaaa!");
        }

        System.out.println("Zamykam się!");
    }
}

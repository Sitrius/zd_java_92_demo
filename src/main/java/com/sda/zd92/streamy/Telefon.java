package com.sda.zd92.streamy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Telefon {

    private String numerSeryjny;

    private double wysokosc;
    private double szerokosc;
    private OS system;
    private List<String> wiadomosci;

    double getPowierzchnia(){
        return wysokosc * szerokosc;
    }
}

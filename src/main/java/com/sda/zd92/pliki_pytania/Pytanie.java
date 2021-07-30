package com.sda.zd92.pliki_pytania;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pytanie {
    private String pytanie;
    private String[] odpowiedzi;    // A B C D
    private int poprawnaOdpowiedz; //  0,1,2,3 / a,b,c,d
}

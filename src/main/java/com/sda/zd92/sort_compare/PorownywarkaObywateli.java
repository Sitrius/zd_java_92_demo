package com.sda.zd92.sort_compare;

import com.sda.zd92.obj.Obywatel;

import java.util.Comparator;

public class PorownywarkaObywateli implements Comparator<Obywatel> {
    // zwracamy wartość int
    // jeśli zwrócimy wartość ujemną to o1 < o2
    // jeśli zwrócimy wartość dodatnią to o1 > o2
    // jeśli zwrócimy wartość 0 to o1 == o2
//    @Override
//    public int compare(Obywatel o1, Obywatel o2) {
//        Long peselO1 = Long.parseLong(o1.getPesel());
//        Long peselO2 = Long.parseLong(o2.getPesel());
//
//    ############################################
//        if(peselO1 > peselO2){
//            return 1;
//        }else if (peselO2 > peselO1){
//            return -1;
//        }
//         ostatni case jest że są równe
//        return 0;
//    ############################################
//        return Long.compare(peselO1, peselO2);
//    }

    @Override
    public int compare(Obywatel o1, Obywatel o2) {
        // (każdy obiekt typu) String posiada metodę compareTo
        return o2.getImie().compareTo(o1.getImie());
        // odwrotność sortowania
//        return o1.getImie().compareTo(o2.getImie());
    }
}
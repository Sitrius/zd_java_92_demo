package com.sda.zd92.paradygmaty;

import com.sda.zd92.paradygmaty.p2.Pies;

public class MainHermetyzacja {
    // Hermetyzacja jest synonimem Enkapsulacja
    //
    // 1. Żeby nikt nam nie napsocił w środku i nie zepsuł naszego układu/działania
    // 2. Staramy się zamykać rzeczy które nie powinny być publiczne
    //
    // Modyfikatory dostępu:
    //      - public                - wszędzie
    //      - protected             - w klasach dziedziczących i w tym samym package'u
    //      - (bez modyfikatora)    - w tym samym package'u
    //      - private               - tylko w klasie (pliku)

    // Zasada mówi:
    // W miarę możliwości uprywatniaj wszystkie pola i metody które nie mają być wykorzystywane na zewnątrz
    //
    // Jeśli metoda jest tylko po to by była użytku wewnętrznego to robimy ją prywatną
    // Jeśli nasz zamiar jest upublicznić metodę to dostosowujemy pozostałe modyfikatory
    //
    class KontoBankowe{
        private double stanKonta;

        public void zwiekszStanKonta(){
//            Pies pies = new Pies();
//            pies.obliczWiek();
        }

        public double getStanKonta() {
            return stanKonta;
        }
    }
}

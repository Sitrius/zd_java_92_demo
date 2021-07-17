package com.sda.zd92.solid;

public class Main {
    public static void main(String[] args) {
//        SOLID
//
//        S - single responsibility
//              - funkcja / klasa powinna mieć jedną odpowiedzialność
//                  - łatwo jest pisać testy
//                  - rozbijamy kod na mniejsze elementy prostsze do zrozumienia
//                  - nie tworzymy metody "porusz całym światem"
//                  - gwarantuje że jeśli coś się zepsuje to musimy naprawić tylko jedną klasę/funkcję
//                  - izolujemy od siebie różne odpowiedzialności
//        O - open / close principle
//              - kod powinien być otwarty na rozszerzenia ale zamknięty na modyfikacje
//                  - jeśli kod jest otwarty na rozszerzenia ale zamknięty na modyfikacje to gwarantuje mi że mogę dodawać
//                        nowe funkcjonalności/implementacje bez potrzeby ingerencji w stary kod
//                  - każda ingerencja w stary kod naraża nas na to że popełnimy błąd i uszkodzimy stary kod
//                  - dodawanie funkcjonalności jest tańsze
//                  - nie ma potrzeby ingerowania
//        L - Liskov substitution
//              - po lewej stronie przypisania/deklaracji powinniśmy pisać możliwie najwyższy typ (który dalej pozwoli
//                        nam realizować naszą funkcjonalność)
//                  - dzięki temu implementacja (prawa strona) jest łatwa do zmiany
//                  - daje nam możliwość zmiany implementacji (Linked/Array/Moja) i otwartości na nowe implementacje O
//        I - Interface segregation
//              - powinniśmy pisać dużo prostych interfejsów (rather then) niżeli duże/złożone interfejsy
//        D - Dependency inversion
//              - Klasa -> Student -> Ocena
//                  ^                   |
//                  ^  <    <      <   <
    }
}

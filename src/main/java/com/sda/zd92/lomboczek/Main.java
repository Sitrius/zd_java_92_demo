package com.sda.zd92.lomboczek;

import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", new HashSet<>());
        Student student2 = new Student("Marian", new HashSet<>());
        Klasa trzecia_b = new Klasa("Trzecia B", new HashSet<>());

        student1.getKlasyStudenta().add(trzecia_b);
        student2.getKlasyStudenta().add(trzecia_b);
        trzecia_b.getStudents().add(student1);
        trzecia_b.getStudents().add(student2);

        System.out.println(trzecia_b);
    }

    // S < --- > K
    @Getter
    @Setter
    @EqualsAndHashCode
    @ToString
    @NoArgsConstructor
    @AllArgsConstructor
    static class Student{
        private String imie;

        @ToString.Exclude
        @EqualsAndHashCode.Exclude
        private Set<Klasa> klasyStudenta;

        // wypisz imie
        // wypisz wszystkie obiekty w set (klasa)
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    @ToString
    @NoArgsConstructor
    @AllArgsConstructor
    static class Klasa{
        private String nazwa; // Klasa 3 B

        @EqualsAndHashCode.Exclude
        private Set<Student> students;

        // wypisz nazwę
        // wypisz wszystkie obiekty w zbiorze student (student)
    }
}

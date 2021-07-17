package com.sda.zd92.kolekcje;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MainLinked {
    public static void main(String[] args) {
        // zadeklarowanie listy daje jasne wskazanie intencji programisty, że będzie używał podstawowywch operacji listowych
        List<Integer> integerList = new LinkedList<>();

        // zadeklarowanie kolejki (deque) daje jasne wskazanie intencji programisty, że będzie używał operacji kolejkowych
        // na HEAD lub TAIL czyli operacje na elementach znajdujących się na początku kolejki lub jej końcu.
        Deque<Integer> integerQueue = new LinkedList<>();

//        Bardzo niewłaściwe jest zadeklarowanie tak jak poniżej, czyli zastosowanie po lewej stronie finalnej impl.
//        LinkedList<Integer> integerLinkedList = new LinkedList<>();

//        integerList.
//        integerLinkedList.
//        integerQueue.

    }
}

package com.sda.zd92.fifolifo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // FIFO
//        Queue<String> elements = new LinkedList<>();
        Stack<String> elements = new Stack<>();

        elements.add("ja");
        elements.add("jestem");
        elements.add("paweł");
        elements.add("gaweł");
        elements.add("a");
        elements.add("wy");
        elements.add("to");
        elements.add("kursanci");

        // dopóki mam elementy w kolejce
        while (!elements.isEmpty()){
//            System.out.println(elements.poll());
            System.out.println(elements.pop());
        }
    }
}

package ru.politech.labs.lab3;

import ru.politech.GUI;

import java.util.Random;

class Store {
    private int product = -1;


    public synchronized int get() {
        while (product < 0) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                GUI.textArea.append(e.getMessage());
            }
        }
        return product;
    }

    public synchronized void put(int number) {
        product = number;
        notify();
    }
}
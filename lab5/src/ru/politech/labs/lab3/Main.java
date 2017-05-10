package ru.politech.labs.lab3;

import ru.politech.GUI;

public class Main {
    public static void main(String[] argv){
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(consumer).start();
        new Thread(producer).start();
    }
}
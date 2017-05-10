package ru.politech;

public class Main {

    public static void main(String[] args) {

        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(consumer).start();
        new Thread(producer).start();
    }
}

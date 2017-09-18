package ru.politech;

public class Main {

    public static void main(String[] args) {

        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);

        // Запускаем Потребителя в новом потоке
        new Thread(consumer).start();

        // Запускаем поставщика в новом потоке
        new Thread(producer).start();
    }
}

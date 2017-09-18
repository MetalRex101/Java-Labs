package ru.politech;

import java.util.Random;

/**
 * Производитель
 */
public class Producer implements Runnable{
    Store store;
    private Random rand = new Random(); // Генератор случайных чисел

    /**
     * Конструктор класса
     *
     * @param store
     */
    Producer(Store store){
        this.store=store;
    }

    /**
     * Возвращает имя класса и имя текущего потока
     *
     * @return
     */
    public String getName(){
        return "Producer " + Thread.currentThread().getName();
    }

    /**
     * Данный метод выполняется при старте потока
     */
    public void run(){
        // Генерируем случайное число
        int random = rand.nextInt(100+1);
        // Записываем в хранилище полученное число
        store.put(random);
        // Выводим имя класса и полученное число
        System.out.println(this.getName() + " " + Integer.toString(random));
    }
}

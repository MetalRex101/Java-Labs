package ru.politech;

/**
 * Потребитель
 */
public class Consumer implements Runnable{
    Store store;

    /**
     * Конструктор класса
     *
     * @param store
     */
    Consumer(Store store){
        this.store=store;
    }

    /**
     * Возвращает имя класса и текущий поток
     *
     * @return
     */
    public String getName(){
        return "Consumer " + Thread.currentThread().getName();
    }

    /**
     * Данный метод выполняется при старте потока
     */
    public void run(){
        // Получаем случайное число
        int val = store.get();

        // Выводим на экран имя класса и число
        System.out.println(this.getName() + " " + val);
    }
}

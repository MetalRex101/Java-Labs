package ru.politech;

/**
 * Created by snake on 23.04.17.
 */
class Store{
    private int product = -1;


    public synchronized int get() {
        while (product < 0) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        return product;
    }

    public synchronized void put(int number) {
        product = number;
        notify();
    }
}

package ru.politech;

/**
 * Хранилище
 */
class Store{
    private int product = -1;

    /**
     * Геттер с синхронизированным доступом
     *
     * @return
     */
    public synchronized int get() {
        // Пока не положено число, ждем
        while (product < 0) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        return product;
    }

    /**
     * Сеттер с синхронизированным доступом
     *
     * @param number
     */
    public synchronized void put(int number) {
        product = number;
        notify();
    }
}

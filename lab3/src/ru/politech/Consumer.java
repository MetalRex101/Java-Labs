package ru.politech;

/**
 * Created by snake on 23.04.17.
 */
public class Consumer implements Runnable{
    Store store;

    Consumer(Store store){
        this.store=store;
    }

    public String getName(){
        return "Consumer " + Thread.currentThread().getName();
    }

    public void run(){
        int val = store.get();
        System.out.println(this.getName() + " " + val);
    }
}

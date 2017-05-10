package ru.politech;

import java.util.Random;

/**
 * Created by snake on 23.04.17.
 */
public class Producer implements Runnable{
    Store store;
    private Random rand = new Random();

    Producer(Store store){
        this.store=store;
    }

    public String getName(){
        return "Producer " + Thread.currentThread().getName();
    }

    public void run(){
        int random = rand.nextInt(100+1);
        store.put(random);
        System.out.println(this.getName() + " " + Integer.toString(random));
    }
}

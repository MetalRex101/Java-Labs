package ru.politech.labs.lab3;

import ru.politech.GUI;

import java.util.Random;

class Producer implements Runnable{
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
        GUI.textArea.append(this.getName() + " " + Integer.toString(random) + "\n");
    }
}
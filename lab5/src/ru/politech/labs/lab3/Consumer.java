package ru.politech.labs.lab3;

import ru.politech.GUI;

class Consumer implements Runnable{
    Store store;

    Consumer(Store store){
        this.store=store;
    }

    public String getName(){
        return "Consumer " + Thread.currentThread().getName();
    }

    public void run(){
        int val = store.get();
        GUI.textArea.append(this.getName() + " " + val + "\n");
    }
}
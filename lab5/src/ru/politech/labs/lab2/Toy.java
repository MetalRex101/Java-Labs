package ru.politech.labs.lab2;

class Toy implements Present {
    @Override public String itCanBePresented(){
        return this.getClass().getName();
    }

}


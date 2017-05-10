package ru.politech.labs.lab2;

class Picture implements Present {
    @Override public String itCanBePresented(){
        return this.getClass().getName();
    }
}
package ru.politech.labs.lab2;

import ru.politech.GUI;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Product> arrList = new ArrayList();
        arrList.add(new Book());
        arrList.add(new Shoe());
        arrList.add(new Picture());
        arrList.add(new Toy());

        for(Product item : arrList){
            if (item instanceof Present) {
                GUI.textArea.append(((Present) item).itCanBePresented()+'\n');
            }
        }
    }
}
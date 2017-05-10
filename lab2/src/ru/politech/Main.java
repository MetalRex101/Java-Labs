package ru.politech;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> arrList = new ArrayList();
        arrList.add(new Book());
        arrList.add(new Shoe());
        arrList.add(new Picture());
        arrList.add(new Toy());

        System.out.println(Arrays.toString(arrList.toArray()) + "\n");

        for(Product item : arrList){
            if(item instanceof Present){
                System.out.println(((Present) item).it_can_be_presented());
            }
        }
    }
}

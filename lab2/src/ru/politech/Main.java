package ru.politech;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Объявляем коллекцию типа ArrayList
        ArrayList<Product> arrList = new ArrayList();
        // Добавляем в коллекцию объект класса Book
        arrList.add(new Book());
        // Добавляем в коллекцию объект класса Shoe
        arrList.add(new Shoe());
        // Добавляем в коллекцию объект класса Picture
        arrList.add(new Picture());
        // Добавляем в коллекцию объект класса Toy
        arrList.add(new Toy());

        // Приводим коллекцию к массиву и выводим на экран
        System.out.println(Arrays.toString(arrList.toArray()) + "\n");

        // Итерируемся по элементам коллекции. Если текущий объект реализует интерфейс Present,
        // Приводим его явно к типу Present, а после вызываем реализуемый метод
        for(Product item : arrList){
            if(item instanceof Present){
                System.out.println(((Present) item).it_can_be_presented());
            }
        }
    }
}

package ru.politech;

public class Main {

    public static void main(String[] args) {
        try {
            if(args.length != 3) throw new ArithmeticException("Неверное кол-во вргументов");
            // Создаем объект калькулятора
            Calculator calc = new Calculator(Float.parseFloat(args[0]), args[1], Float.parseFloat(args[2]));
            // Выводим на экран список аргументов, переданных через командную строку
            System.out.println("Операнд1 = " + calc.getFirstArg());
            System.out.println("Операция = " + calc.getOperation());
            System.out.println("Операдн2 = " + calc.getSecondArg());
            // Выводим результат
            System.out.println(calc.getResultType() + " = " + calc.getResult());
        }catch (ArithmeticException e){
            // Если в течение работы программы было выброшено исключение, выведем ошибку на экран
            System.err.println(e.getMessage());
        }
    }
}

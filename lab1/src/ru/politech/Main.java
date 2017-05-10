package ru.politech;

public class Main {

    public static void main(String[] args) {
        try {
            if(args.length != 3) throw new ArithmeticException("Неверное кол-во вргументов");
            Calculator calc = new Calculator(Float.parseFloat(args[0]), args[1], Float.parseFloat(args[2]));
            System.out.println("Операнд1 = " + calc.getFirstArg());
            System.out.println("Операция = " + calc.getOperation());
            System.out.println("Операдн2 = " + calc.getSecondArg());
            System.out.println(calc.getResultType() + " = " + calc.getResult());
        }catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }
    }
}

package ru.politech.labs.lab1;
import ru.politech.GUI;

import java.io.IOException;

class api {

    private float operand1, operand2;

    private Float performOperation(String operation){
        try {
            switch (operation){
                case "+" : return plus();
                case "-" : return minus();
                case "*" : return multiply();
                case "/" : return divide();

                default : {
                    throw new IOException("Operation nod found");
                }
            }
        }
        catch (Exception e){
            GUI.textArea.append(e.getMessage());
            return null;
        }
    }

    public api(String operand1, String operation, String operand2){
        try {
            this.operand1 = Float.parseFloat(operand1);
            this.operand2 = Float.parseFloat(operand2);
            GUI.textArea.append("Операнд1 = " + operand1 + "\n");
            GUI.textArea.append("Операнд2 = " + operand2 + '\n');
            GUI.textArea.append((performOperation(operation)).toString());
        }
        catch (Exception e){
            GUI.textArea.append(e.getMessage());
        }
    }
    private Float plus(){
        GUI.textArea.append("Сумма = ");
        return operand1 + operand2;
    }
    private Float minus(){
        GUI.textArea.append("Разность = ");
        return operand1 - operand2;
    }
    private Float multiply(){
        GUI.textArea.append("Произведение = ");
        return operand1 * operand2;
    }
    private  Float divide(){
        GUI.textArea.append("Частное = ");
        return operand1 / operand2;
    }
}

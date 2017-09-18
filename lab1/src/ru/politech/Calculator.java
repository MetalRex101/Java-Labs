package ru.politech;

/**
 * Created by snake on 22.04.17.
 */
public class Calculator {
    private float firstArg;
    private float secondArg;
    private String operation;
    private float result;
    private String resultType;

    /**
     * Конструктор класса
     *
     * @param firstArg
     * @param operation
     * @param secondArg
     */
    public Calculator(float firstArg, String operation, float secondArg)
    {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
        this.operation = operation;
        this.performOperation(); // Выполняем вычисления
    }

    /**
     * В зависимости от оператора выполняет нужную операцию.
     * Если введен некорректный оператор, выбросит исключение
     *
     * @throws ArithmeticException
     */
    private void performOperation() throws ArithmeticException{
        switch (this.operation){
            case "+": this.result = this.firstArg + this.secondArg; this.resultType = "Сумма"; break;
            case "-": this.result = this.firstArg - this.secondArg; this.resultType = "Разность"; break;
            case "*": this.result = this.firstArg * this.secondArg; this.resultType = "Произведение"; break;
            case "/":
                if(this.secondArg == 0) throw new ArithmeticException("Division by zero");
                this.result = this.firstArg / this.secondArg; this.resultType = "Частное"; break;
            default: throw new ArithmeticException("Operation nod found");
        }
    }

    public String getFirstArg() {
        return Float.toString(this.firstArg);
    }

    public String getSecondArg() {
        return Float.toString(this.secondArg);
    }

    public String getOperation() {
        return operation;
    }

    public String getResultType(){
        return this.resultType;
    }

    public String getResult(){
        return Float.toString(this.result);
    }
}

package com.tophersikorra;

public class MathEquation {
    private double operand1 = 0;
    private double operand2 = 0;
    private char operator = 'a';
    private double result;

    public MathEquation() { }

    public MathEquation(char operator) {
        this.operator = operator;
    }

    public MathEquation(double operand1, double operand2, char operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public void execute(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;

        execute();
    }

    public void execute() {
        switch(operator) {
            case 'a':
                result =  operand1 + operand2;
                break;
            case 's':
                result = operand1 - operand2;
                break;

            case 'm':
                result = operand1 * operand2;
                break;

            case 'd':
                result = operand2 != 0.0 ? operand1 / operand2 : 0.0;
                break;
            default:
                result = 0.0;
                System.out.println("Error - invalid operator");
                break;
        }
    }

    public double getResult() {
        return result;
    }
}

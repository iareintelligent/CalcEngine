package com.tophersikorra;

public class MathEquation {
    public double operand1;
    public double operand2;
    public char operator;
    public double result;

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
}

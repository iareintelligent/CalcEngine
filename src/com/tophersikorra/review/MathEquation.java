package com.tophersikorra.review;

// final add = new MathEquation('a');
// System.out.println(add.execute(1, 1);
public class MathEquation {
    
    private final char operator;
    
    public MathEquation(final char operator) {
        this.operator = operator;
    }
    
    public double execute(double operand1, double operand2) {
        switch(operator) {
            case 'a':
                return  operand1 + operand2;
                
            case 's':
                return operand1 - operand2;

            case 'm':
                return operand1 * operand2;

            case 'd':
                return operand2 != 0.0 ? operand1 / operand2 : 0.0;
            default:
                System.out.println("Error - invalid operators");
                throw new RuntimeException("Invalid Operator");
        }
    }
    
}

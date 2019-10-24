package com.tophersikorra;

public class Divider extends CalculateBase {
    public Divider() {}

    public Divider(double operand1, double operand2) {
        super(operand1,operand2);
    }

    @Override
    public void calculate() {
        if (getOperand2() == 0) {
            System.out.println("Infinity");
            setResult(0.0);
        } else {
            double product = getOperand1() / getOperand2();
            setResult(product);
        }
    }
}

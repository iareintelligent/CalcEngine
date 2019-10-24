package com.tophersikorra;

public class Subtracter extends CalculateBase {
    public Subtracter() {}

    public Subtracter(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public void calculate() {
        double sum = getOperand1() - getOperand2();
        setResult(sum);
    }
}

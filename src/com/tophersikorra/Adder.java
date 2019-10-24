package com.tophersikorra;

public class Adder extends CalculateBase {
    public Adder() {}

    public Adder(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public void calculate() {
        double sum = getOperand1() + getOperand2();
        setResult(sum);
    }
}

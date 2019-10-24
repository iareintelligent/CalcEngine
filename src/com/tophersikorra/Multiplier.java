package com.tophersikorra;

public class Multiplier extends CalculateBase {

    public Multiplier() {}

    public Multiplier(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public void calculate() {
        double product = getOperand1() * getOperand2();
        setResult(product);
    }
}

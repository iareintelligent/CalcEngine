package com.tophersikorra.review;

public class Adder implements BiFunction {
    @Override
    public double calculate(double operand1, double operand2) {
        return operand1 + operand2;
    }
}

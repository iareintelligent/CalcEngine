package com.tophersikorra.cal2;

public class ValueExpression implements Expression {

    private final double value;

    public ValueExpression(final double value) {
        this.value = value;
    }

    @Override
    public double express() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

package com.tophersikorra.cal2.operations;

import com.tophersikorra.cal2.Expression;

public class DivideExpression implements Expression {
    private final Expression left;
    private final Expression right;

    public DivideExpression(final Expression left, final Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double express() {
        final double rightValue = right.express();
        if (rightValue == 0.0) {
            throw new RuntimeException("Divide By Zero");
        }
        return left.express() / rightValue;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }
}

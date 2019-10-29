package com.tophersikorra.cal2;

public class MultiplyExpression implements Expression {
    private final Expression left;
    private final Expression right;

    public MultiplyExpression(final Expression left, final Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double express() {
        return left.express() * right.express();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }
}

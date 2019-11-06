package main.java.com.tophersikorra.evaluater.operations;

import main.java.com.tophersikorra.evaluater.Expression;

public class SubtractExpression implements Expression {
    private final Expression left;
    private final Expression right;

    public SubtractExpression(final Expression left, final Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double express() {
        return left.express() - right.express();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }
}

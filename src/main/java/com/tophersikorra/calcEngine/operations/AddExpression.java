package main.java.com.tophersikorra.calcEngine.operations;

import main.java.com.tophersikorra.calcEngine.Expression;

public class AddExpression implements Expression {
    private final Expression left;
    private final Expression right;

    public AddExpression(final Expression left, final Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double express() {
        return left.express() + right.express();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }
}

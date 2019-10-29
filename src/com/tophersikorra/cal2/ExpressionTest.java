package com.tophersikorra.cal2;

public class ExpressionTest {

    public static void main(final String[] args) {
        // (10 + (8 * 7))
        final Expression e =
                new AddExpression(
                        new ValueExpression(10),
                        new MultiplyExpression(new ValueExpression(8), new ValueExpression(7))
                );
        assert e.express() == 66.0;

        System.out.println(e.toString());
    }
}

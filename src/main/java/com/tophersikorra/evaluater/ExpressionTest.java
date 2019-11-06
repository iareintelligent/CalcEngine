package main.java.com.tophersikorra.evaluater;

import main.java.com.tophersikorra.evaluater.operations.AddExpression;
import main.java.com.tophersikorra.evaluater.operations.MultiplyExpression;
import main.java.com.tophersikorra.evaluater.operations.ValueExpression;

public class ExpressionTest {

    public static void main(final String[] args) {
//         (10 + (8 * 7))
        final Expression e =
                new AddExpression(
                        new ValueExpression(10),
                        new MultiplyExpression(new ValueExpression(8), new ValueExpression(7))
                );
//        ExpressionParser.parse("(10 + (8 * 7))");
        assert e.express() == 65.0;

        System.out.println(e.toString());
    }
}

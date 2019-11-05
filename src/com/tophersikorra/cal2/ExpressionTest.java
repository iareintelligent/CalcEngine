package com.tophersikorra.cal2;

import com.tophersikorra.cal2.operations.AddExpression;
import com.tophersikorra.cal2.operations.MultiplyExpression;
import com.tophersikorra.cal2.operations.ValueExpression;

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

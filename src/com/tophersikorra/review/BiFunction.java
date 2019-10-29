package com.tophersikorra.review;

public interface BiFunction {
    double calculate(double operand1, double operand2);
}

// "(1 + 2) / 2)"

//double f =
//        new DivideFunction(
//            new AddFunction(new ValueFunction(1), new ValueFunction(2)),
//            new ValueFunction(2)
//        ).express();
//
//System.out.println(f);
//
//step 1 in the divide function
//a.express() / b.express()
//
//next, express a (add function)
//a.express() returns 3
//
//next b.express(), return 2
//
//finally, 3 / 2
//
//
//


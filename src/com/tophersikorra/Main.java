package com.tophersikorra;

public class Main {

    public static void main(String[] args) {
        MathEquation testEquation = new MathEquation();
        testEquation.execute();
        System.out.println(testEquation.getResult());

        MathEquation[] equations = new MathEquation[4];

        equations[0] = new MathEquation(100.0, 0.0, 'd');
        equations[1] = new MathEquation(0, 50.0, 'a');
        equations[2] = new MathEquation(.5, 50.0, 's');
        equations[3] = new MathEquation(12.0, 3.0, 'm');

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.format("result = %f\n", equation.getResult());
        }

        System.out.println();
        System.out.println("Using Overloads");
        System.out.println();

        double operand1 = 9.0;
        double operand2 = 4.0;
        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(operand1, operand2);
        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        equationOverload.execute(leftInt, rightInt);
        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        equationOverload.execute((double) leftInt, (double) rightInt);
        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        CalculateBase[] calculators = {
            new Divider(100.0, 50.0),
            new Adder(25., 92.),
            new Subtracter(225., 15.),
            new Multiplier(11., 3.)
        };

        for (CalculateBase calculator : calculators) {
            calculator.calculate();
            System.out.print("result = ");
            System.out.println(calculator.getResult());
        }
    }

}

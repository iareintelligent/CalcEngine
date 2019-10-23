package com.tophersikorra;

public class Main {

    public static void main(String[] args) {
        MathEquation[] equations = new MathEquation[4];

        equations[0] = create(100.0, 0.0, 'd');
        equations[1] = create(0, 50.0, 'a');
        equations[2] = create(224.5, 50.0, 's');
        equations[3] = create(10.0, 3.0, 'm');

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.result);
        }


    }

    public static MathEquation create(double operand1, double operand2, char operator) {
        MathEquation equation = new MathEquation();
        equation.operand1 = operand1;
        equation.operand2 = operand2;
        equation.operator = operator;

        return equation;

    }
}

package com.tophersikorra;

public class Main {

    public static void main(String[] args) {
        MathEquation[] equations = new MathEquation[4];

        equations[0] = new MathEquation(100.0, 0.0, 'd');
        equations[1] = new MathEquation(0, 50.0, 'a');
        equations[2] = new MathEquation(.5, 50.0, 's');
        equations[3] = new MathEquation(12.0, 3.0, 'm');

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.format("result = %f\n", equation.getResult());
        }


    }

}

package com.tophersikorra;

public class Main {

    public static void main(String[] args) {
//        useMathEquation();
//        useCalculatorBase();

        String[] statements = {
                "add 1.0",
                "add xx 25.0",
                "addx 0.0 0.0",
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        CalculateHelper helper = new CalculateHelper();

        for (String statement : statements) {
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch(InvalidStatementException e) {
                System.out.println(e.getMessage());
                if(e.getCause() != null) {
                    System.out.println("|-> Original Exception: " + e.getCause());
                }
            }


        }


    }


//    static void useMathEqution() {
//        MathEquation[] equations = new MathEquation[4];
//
//        equations[0] = new MathEquation(100.0, 0.0, 'd');
//        equations[1] = new MathEquation(0, 50.0, 'a');
//        equations[2] = new MathEquation(.5, 50.0, 's');
//        equations[3] = new MathEquation(12.0, 3.0, 'm');
//
//        for (MathEquation equation : equations) {
//            equation.execute();
//            System.out.format("result = %f\n", equation.getResult());
//        }
//
//        System.out.println();
//        System.out.println("Using Overloads");
//        System.out.println();
//
//        double operand1 = 9.0;
//        double operand2 = 4.0;
//        int leftInt = 9;
//        int rightInt = 4;
//
//        MathEquation equationOverload = new MathEquation('d');
//
//        equationOverload.execute(operand1, operand2);
//        System.out.print("result = ");
//        System.out.println(equationOverload.getResult());
//
//        equationOverload.execute(leftInt, rightInt);
//        System.out.print("result = ");
//        System.out.println(equationOverload.getResult());
//
//        equationOverload.execute((double) leftInt, (double) rightInt);
//        System.out.print("result = ");
//        System.out.println(equationOverload.getResult());
//    }
//
//    static void useCalculatorBase() {
//        System.out.println();
//        System.out.println("Using Inheritance");
//        System.out.println();
//
//        CalculateBase[] calculators = {
//                new Divider(100.0, 50.0),
//                new Adder(25., 92.),
//                new Subtracter(225., 15.),
//                new Multiplier(11., 3.)
//        };
//
//        for (CalculateBase calculator : calculators) {
//            calculator.calculate();
//            System.out.print("result = ");
//            System.out.println(calculator.getResult());
//        }
//    }
}

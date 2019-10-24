package com.tophersikorra;

public class CalculateHelper {
    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACT_SYMBOL = '-';
    private static final char MULTIPLY_SYMBOL = '*';
    private static final char DIVIDE_SYMBOL = '/';


    Operators operator;
    double operand1;
    double operand2;
    double result;

    public void process(String statement) {
        // add 1.0 2.0
        String[] parts = statement.split(" ");

        String commandString = parts[0];
        operand1 = Double.parseDouble(parts[1]);
        operand2 = Double.parseDouble(parts[2]);

        setCommandFromString(commandString);

        CalculateBase calculator = null;

        switch (operator) {
            case Add:
                calculator = new Adder(operand1, operand2);
                break;
            case Subtract:
                calculator = new Subtracter(operand1, operand2);
                break;
            case Multiply:
                calculator = new Multiplier(operand1, operand2);
                break;
            case Divide:
                calculator = new Divider(operand1, operand2);
                break;
        }

        calculator.calculate();
        result = calculator.getResult();
    }

    private void setCommandFromString(String commandString) {
        if (commandString.equalsIgnoreCase(Operators.Add.toString())) {
            operator = Operators.Add;
        } else if (commandString.equalsIgnoreCase(Operators.Subtract.toString())) {
            operator = Operators.Subtract;
        } else if (commandString.equalsIgnoreCase(Operators.Multiply.toString())) {
            operator = Operators.Multiply;
        } else if (commandString.equalsIgnoreCase(Operators.Divide.toString())) {
            operator = Operators.Divide;
        }
    }

    @Override
    public String toString() {
        //  1.0 + 2.0 = 3.0
        char symbol = ' ';

        switch(operator) {
            case Add:
                symbol = ADD_SYMBOL;
                break;
            case Subtract:
                symbol = SUBTRACT_SYMBOL;
                break;
            case Multiply:
                symbol = MULTIPLY_SYMBOL;
                break;
            case Divide:
                symbol = DIVIDE_SYMBOL;
                break;
        }

        StringBuilder sb = new StringBuilder(20);

        sb.append(operand1);
        sb.append(' ');
        sb.append(symbol);
        sb.append(' ');
        sb.append(operand2);
        sb.append(" = ");
        sb.append(result);

        return sb.toString();

    }

}

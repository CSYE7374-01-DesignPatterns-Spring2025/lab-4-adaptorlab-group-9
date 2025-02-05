package edu.neu.csye7374;

public class Calculatable implements CalculatableAPI {
    @Override
    public double operation(OPERATION op, double a, double b) {
        double result = 0;
        switch (op.toString()) {
            case "ADD":
                result = a + b;
                break;
            case "SUB":
                result = b - a;
                break;
            case "DIV":
                result = a / b;
                break;
            case "MUL":
                result = a * b;
                break;

        }
        return result;
    }
}

package edu.neu.csye7374;

import java.util.List;

public class CalculatorAdapter implements AccumulatableAPI {
    private final Calculatable calculator;
    private double sum;

    public CalculatorAdapter(Calculatable calc) {
        super();
        this.calculator = calc; // 3rd Party App
        this.sum = 0;
    }

    @Override
    public double accumulation(List<Double> prices) {
        sum = 0;
        for (double itemPrice : prices) {
            sum = this.calculator.operation(CalculatableAPI.OPERATION.ADD,
                    sum, itemPrice);
        }
        return sum;
    }

    @Override
    public double payment(double cash) {
        return this.calculator.operation(CalculatableAPI.OPERATION.SUB,
                cash, sum);
    }

    @Override
    public double multiply(double factor) {
        return this.calculator.operation(CalculatableAPI.OPERATION.MUL, sum, factor);
    }

    @Override
    public double divide(double divisor) {
        return this.calculator.operation(CalculatableAPI.OPERATION.DIV, sum, divisor);
    }

}

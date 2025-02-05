package edu.neu.csye7374;

import java.util.List;

public class CalculatorClassAPI extends Calculatable implements AccumulatableAPI {

    private double sum;

    public CalculatorClassAPI() {
        super();
        // super.calculator = calc; // 3rd Party App
        this.sum = 0;
    }

    @Override
    public double accumulation(List<Double> prices) {
        sum = 0;
        for (double itemPrice : prices) {
            sum = super.operation(CalculatableAPI.OPERATION.ADD,
                    sum, itemPrice);
        }
        return sum;
    }

    @Override
    public double payment(double cash) {
        return super.operation(CalculatableAPI.OPERATION.SUB,
                cash, sum);
    }

    @Override
    public double multiply(double factor) {
        return operation(CalculatableAPI.OPERATION.MUL, sum, factor);
    }

    @Override
    public double divide(double divisor) {
        return operation(CalculatableAPI.OPERATION.DIV, sum, divisor);
    }

}

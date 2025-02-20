package edu.neu.csye7374;

public interface CalculatableAPI {
    public enum OPERATION {
        ADD, SUB, MUL, DIV
    }

    double operation(OPERATION op, double a, double b);
}
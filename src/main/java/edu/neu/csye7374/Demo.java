package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void demo() {
        List<Double> itemPrices = new ArrayList<Double>();
        ;
        itemPrices.add(200.00);
        itemPrices.add(300.00);
        itemPrices.add(500.00);

        CalculatorAdapter calc = new CalculatorAdapter(new Calculatable());
        CalculatorClassAPI calc2 = new CalculatorClassAPI();
        System.out.println("============Object Design Pattern===================\n\n");

        System.out.println("The result of accumulation " + calc.accumulation(itemPrices));
        System.out.println("The result of Payment " + calc.payment(300.00));
        System.out.println("The result of multiplication " + calc.multiply(2));
        System.out.println("The result of division " + calc.divide(3));

        System.out.println("============Adapter Structural Class Design Pattern===================\n\n");

        System.out.println("The result of accumulation " + calc2.accumulation(itemPrices));
        System.out.println("The result of Payment " + calc2.payment(400.00));
        System.out.println("The result of multiplication " + calc2.multiply(5));
        System.out.println("The result of division " + calc2.divide(2));
    }
}

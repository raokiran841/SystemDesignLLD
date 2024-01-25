package org.calculator;

import org.calculator.compositeDesignPattern.Expression;
import org.calculator.compositeDesignPattern.Number;
import org.calculator.compositeDesignPattern.Operation;

public class Main2 {
    public static void main(String[] args) {
        // 2*(1+7)
        Expression exp = new Expression(
                new Number(2),
                Operation.MULTIPLY,
                new Expression(
                        new Number(1),
                        Operation.ADD,
                        new Number(7)
                )
        );
        System.out.println("2*(1+7) = "+exp.evaluate());

        // (20 - 2/2) + 2*2
        Expression exp2 = new Expression(
                new Expression(
                        new Number(20),
                        Operation.SUBTRACT,
                        new Expression(
                                new Number(2),
                                Operation.DIVIDE,
                                new Number(2)
                        )
                ),
                Operation.ADD,
                new Expression(
                        new Number(2),
                        Operation.MULTIPLY,
                        new Number(2)
                )
        );
        System.out.println("(20 - 2/2) + 2*2 = "+exp2.evaluate());
    }
}

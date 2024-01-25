package org.calculator.compositeDesignPattern;

public class Number implements ArithmaticExpression {
    private int num;
    public Number(int num){
        this.num = num;
    }

    @Override
    public double evaluate() {
        return this.num;
    }
}

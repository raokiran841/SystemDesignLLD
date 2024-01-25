package org.calculator.compositeDesignPattern;

public class Expression implements ArithmaticExpression{
    Operation op;
    ArithmaticExpression leftExp;
    ArithmaticExpression rightExp;

    public Expression(ArithmaticExpression leftExp, Operation op, ArithmaticExpression rightExp){
        this.leftExp = leftExp;
        this.rightExp = rightExp;
        this.op = op;
    }
    @Override
    public double evaluate() {
        double res = 0.0;
        switch (this.op){
            case ADD:
                res = leftExp.evaluate() + rightExp.evaluate();
                break;
            case SUBTRACT:
                res = leftExp.evaluate() - rightExp.evaluate();
                break;
            case MULTIPLY:
                res = leftExp.evaluate() * rightExp.evaluate();
                break;
            case DIVIDE:
                res = leftExp.evaluate() / rightExp.evaluate();
                break;
            default:
                res = 0.0;
        }
        return res;
    }
}

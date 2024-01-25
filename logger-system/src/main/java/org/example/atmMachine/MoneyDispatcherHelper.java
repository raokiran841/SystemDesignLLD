package org.example.atmMachine;

public abstract class MoneyDispatcherHelper {
    private double amount;

    MoneyDispatcherHelper nextMoneyDispatcherHelper;

    public MoneyDispatcherHelper(MoneyDispatcherHelper nextMoneyDispatcherHelper){
        this.nextMoneyDispatcherHelper = nextMoneyDispatcherHelper;
    }

    public abstract String dispatch(double amount);
}

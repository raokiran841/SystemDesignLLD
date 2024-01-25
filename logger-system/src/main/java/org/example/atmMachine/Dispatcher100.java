package org.example.atmMachine;

public class Dispatcher100 extends MoneyDispatcherHelper{
    public Dispatcher100(MoneyDispatcherHelper nextMoneyDispatcherHelper) {
        super(nextMoneyDispatcherHelper);
    }

    @Override
    public String dispatch(double amount) {
        return ", "+ (int)amount/100 + " 100 notes and " + amount%100 + " change";
    }
}

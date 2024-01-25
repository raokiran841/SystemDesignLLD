package org.example.atmMachine;

public class Dispatcher2000 extends MoneyDispatcherHelper{
    public Dispatcher2000(MoneyDispatcherHelper nextMoneyDispatcherHelper) {
        super(nextMoneyDispatcherHelper);
    }

    @Override
    public String dispatch(double amount) {
        int count = (int)amount/2000;
        double remaining = amount % 2000;
        return count + " 2000 notes " + nextMoneyDispatcherHelper.dispatch(remaining);
    }
}

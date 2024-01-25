package org.example.atmMachine;

public class Dispatcher500 extends MoneyDispatcherHelper{
    public Dispatcher500(MoneyDispatcherHelper nextMoneyDispatcherHelper) {
        super(nextMoneyDispatcherHelper);
    }

    @Override
    public String dispatch(double amount) {
        int count = (int)amount/500;
        double remaining = amount % 500;
        return ", "+count + "  500 notes "+ nextMoneyDispatcherHelper.dispatch(remaining);
    }
}

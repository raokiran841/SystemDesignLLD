package org.example;

import org.example.atmMachine.Dispatcher100;
import org.example.atmMachine.Dispatcher2000;
import org.example.atmMachine.Dispatcher500;
import org.example.atmMachine.MoneyDispatcherHelper;
import org.example.logger.*;

public class Main {
    public static void main(String[] args) {

        LoggerHelper helper = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        helper.printMsg(MessageType.ERROR, "Exception occurred");
        helper.printMsg(MessageType.DEBUG, "This needs to be debugged");
        helper.printMsg(MessageType.INFO, "This is just an information");

        MoneyDispatcherHelper moneyHelper = new Dispatcher2000(new Dispatcher500(new Dispatcher100(null)));
        String res = moneyHelper.dispatch(15_000_000);
        System.out.println(res);
    }
}
package org.example.logger;

public class DebugLogger extends LoggerHelper{
    public DebugLogger(LoggerHelper nextLoggerHelper) {
        super(nextLoggerHelper);
    }

    @Override
    public void printMsg(MessageType msgType, String msg) {
        if(msgType.equals(MessageType.DEBUG)){
            System.out.println(MessageType.DEBUG + " : "+ msg);
        } else {
            nextLoggerHelper.printMsg(msgType, msg);
        }
    }
}

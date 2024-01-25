package org.example.logger;

public class ErrorLogger extends LoggerHelper{
    public ErrorLogger(LoggerHelper nextLoggerHelper) {
        super(nextLoggerHelper);
    }

    @Override
    public void printMsg(MessageType msgType, String msg) {
        if(msgType.equals(MessageType.ERROR)){
            System.out.println(MessageType.ERROR + " : "+ msg);
        }
    }
}

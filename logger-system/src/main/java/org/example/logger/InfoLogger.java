package org.example.logger;

public class InfoLogger extends LoggerHelper{
    public InfoLogger(LoggerHelper nextLoggerHelper){
        super(nextLoggerHelper);
    }

    @Override
    public void printMsg(MessageType msgType, String msg) {
        if(msgType.equals(MessageType.INFO)){
            System.out.println(MessageType.INFO + " : "+ msg);
        } else {
            nextLoggerHelper.printMsg(msgType, msg);
        }
    }
}

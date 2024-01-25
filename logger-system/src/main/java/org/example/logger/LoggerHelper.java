package org.example.logger;

public abstract class LoggerHelper {
    private String message;
    private MessageType msgType;

    LoggerHelper nextLoggerHelper;

    public LoggerHelper(LoggerHelper nextLoggerHelper) {
        this.nextLoggerHelper = nextLoggerHelper;
    }

    public abstract void printMsg(MessageType msgType, String msg);

}

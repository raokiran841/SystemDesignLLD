package org.singleton;

import java.io.ObjectStreamException;

public class Singleton {
    private static volatile Singleton singleton;

    private static int data;

    public int getData() {
        return this.data;
    }

    public void setData(int data){
        this.data = data;
    }

    private Singleton(){
        if(singleton != null){
            throw new IllegalStateException("Singleton instance already created");
        }
    }

    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    data = 5;
                    return new Singleton();
                }
            }
        }
        return singleton;
    }

    private Object readResolve() throws ObjectStreamException {
        return singleton;
    }
    private Object writeReplace() throws ObjectStreamException {
        return singleton;
    }
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

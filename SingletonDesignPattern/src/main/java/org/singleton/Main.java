package org.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = obj;
        obj.setData(10);
        System.out.println("Hello world! "+ obj2.getData() +" : "+ obj.getData());
    }
}
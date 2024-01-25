package org.example;

public abstract class Players {
    String name;
    Sign sign;

    protected Players(String name, Sign s){
        this.name = name;
        this.sign = s;
    }

    public String toString(){
        return "Player: "+name+" with Sign: "+sign.name();
    }
}

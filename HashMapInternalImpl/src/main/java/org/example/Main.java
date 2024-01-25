package org.example;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> hm = new MyHashMap<>();

        hm.put(100, "Hello");
        hm.put(200, "There");
        hm.put(300, "My");
        hm.put(400, "name");
        hm.put(500, "is");
        hm.put(600, "Karan");
        hm.put(600, "Kiran");
        hm.put(700, "Kumar");
        hm.put(800, "Rao.");
        hm.put(900, "How");
        hm.put(1000, "are");
        hm.put(1100, "you");
        hm.put(1200, "my");
        hm.put(1300, "friends");
        hm.put(1400, "?");

        System.out.println("My hashmap "+ hm.toString());

        System.out.println(hm.get(50));
        System.out.println(hm.get(600));
    }
}
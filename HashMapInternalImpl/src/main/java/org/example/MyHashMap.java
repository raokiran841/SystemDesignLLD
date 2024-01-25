package org.example;

import java.util.HashMap;

public class MyHashMap<K, V> {
    private static final int INITIAL_CAPACITY = 1<<4; // 1*2^4 = 16
    private static final int MAX_CAPACITY = 1<<30; // 1*2^30

    Entry[] hashTable;

    public MyHashMap(){
        hashTable = new Entry[INITIAL_CAPACITY];
    }

    public MyHashMap(int cap){
        int tableSize = getTableCapacity(cap);
        hashTable = new Entry[tableSize];
    }

    private int getTableCapacity(int cap){
        int x = cap-1;
        x |= x >>> 1;
        x |= x >>> 2;
        x |= x >>> 4;
        x |= x >>> 8;
        x |= x >>> 16;
        return (x<0) ? 1 : ((x>=MAX_CAPACITY) ? MAX_CAPACITY : x+1);
    }

    public class Entry<K,V>{
        K key;
        V value;
        Entry next;

        public Entry(K k, V v){
            this.key = k;
            this.value = v;
        }

        public K getKey(){return this.key;}
        public V getValue(){return this.value;}

        public void setKey(K key){
            this.key = key;
        }

        public void setValue(V value){
            this.value = value;
        }

        public String toString(){ return key +"="+ value;}
    }

    public String toString(){
        String str = "[";
        for(Entry entry: hashTable){
            while(entry != null){
                str += entry.toString() + ", ";
                entry = entry.next;
            }
        }
        str += "\b]";
        return str;
    }

    public void put(K key, V value){
        int hash = key.hashCode() % hashTable.length;
        Entry node = hashTable[hash];

        if(node == null){
            hashTable[hash] = new Entry(key, value);
        } else {
            Entry prev = node;
            while(node != null){
                if(node.key.equals(key)){
                    node.value = value;
                    return;
                }
                prev = node;
                node = node.next;
            }
            Entry newEntry = new Entry(key, value);
            prev.next = newEntry;
        }
    }

    public V get(K key){
        int hash = key.hashCode() % hashTable.length;
        Entry node = hashTable[hash];
        while(node != null){
            if(node.key.equals(key)){
                return (V)node.value;
            }
            node = node.next;
        }
        return null;
    }

    HashMap<Integer, String> hm = new HashMap<>();
}

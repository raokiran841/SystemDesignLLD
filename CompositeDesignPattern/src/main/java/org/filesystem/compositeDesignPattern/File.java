package org.filesystem.compositeDesignPattern;

public class File implements FileSystem {
    String name;

    public File(String name){
        this.name = name;
    }
    public void ls(String str){
        System.out.println(str+"- "+name);
    }
}

package org.filesystem.problem;

public class File {
    String name;

    public File(String name){
        this.name = name;
    }
    public void ls(String str){
        System.out.println(str+"- "+name);
    }
}

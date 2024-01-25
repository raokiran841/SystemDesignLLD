package org.filesystem.compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    private String name;
    private List<FileSystem> objectList;
    public Directory(String name){
        this.name = name;
        this.objectList = new ArrayList<>();
    }

    public void add(FileSystem obj){
        this.objectList.add(obj);
    }

    public void ls(String str){
        System.out.println(str+"+ "+name);
        str += "\t";
        for(FileSystem obj : objectList){
            obj.ls(str);
        }
    }
}

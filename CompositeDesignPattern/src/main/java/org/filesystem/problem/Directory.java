package org.filesystem.problem;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<Object> objectList;
    public Directory(String name){
        this.name = name;
        this.objectList = new ArrayList<>();
    }

    public void add(Object obj){
        this.objectList.add(obj);
    }

    public void ls(String str){
        System.out.println(str+"+ "+name);
        str += "\t";
        for(Object obj : objectList){
            if(obj instanceof File){
                ((File)obj).ls(str);
            } else if(obj instanceof Directory){
                ((Directory)obj).ls(str);
            } else {
                System.out.println("------------------");
            }
        }
    }
}

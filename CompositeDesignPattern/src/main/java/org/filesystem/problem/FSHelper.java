package org.filesystem.problem;

public class FSHelper {
    public void init(){
        Directory dir = new Directory("level 1");
        dir.add(new File("file 1"));
        dir.add(new File("file 2"));
        dir.add(new File("file 3"));
        Directory dir2 = new Directory("level 2.1");
        dir.add(dir2);
        dir2.add(new File("file 4"));
        Directory dir3 = new Directory("level 3.1");
        Directory dir4 = new Directory("level 3.2");
        dir2.add(dir3);
        dir2.add(dir4);
        dir3.add(new File("file 5"));
        dir4.add(new File("file 6"));

        Directory dir5 = new Directory("level 2.2");
        dir.add(dir5);
        Directory dir6 = new Directory("level 3.3");
        Directory dir7 = new Directory("level 3.4");
        dir5.add(dir6);
        dir5.add(dir7);
        dir6.add(new File("file 8"));
        dir7.add(new File("file 9"));

        dir.ls("");
    }
}

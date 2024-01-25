package org.filesystem.compositeDesignPattern;

import org.filesystem.problem.Directory;
import org.filesystem.problem.File;

public class FSHelperSolution {
    public void init(){
        org.filesystem.problem.Directory dir = new org.filesystem.problem.Directory("level 1");
        dir.add(new org.filesystem.problem.File("file 1"));
        dir.add(new org.filesystem.problem.File("file 2"));
        dir.add(new org.filesystem.problem.File("file 3"));
        org.filesystem.problem.Directory dir2 = new org.filesystem.problem.Directory("level 2.1");
        dir.add(dir2);
        dir2.add(new org.filesystem.problem.File("file 4"));
        org.filesystem.problem.Directory dir3 = new org.filesystem.problem.Directory("level 3.1");
        org.filesystem.problem.Directory dir4 = new org.filesystem.problem.Directory("level 3.2");
        dir2.add(dir3);
        dir2.add(dir4);
        dir3.add(new org.filesystem.problem.File("file 5"));
        dir4.add(new org.filesystem.problem.File("file 6"));

        org.filesystem.problem.Directory dir5 = new org.filesystem.problem.Directory("level 2.2");
        dir.add(dir5);
        org.filesystem.problem.Directory dir6 = new org.filesystem.problem.Directory("level 3.3");
        org.filesystem.problem.Directory dir7 = new Directory("level 3.4");
        dir5.add(dir6);
        dir5.add(dir7);
        dir6.add(new org.filesystem.problem.File("file 8"));
        dir7.add(new File("file 9"));

        dir.ls("");
    }
}

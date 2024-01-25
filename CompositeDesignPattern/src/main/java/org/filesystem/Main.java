package org.filesystem;

import org.filesystem.compositeDesignPattern.FSHelperSolution;
import org.filesystem.problem.FSHelper;

public class Main {
    public static void main(String[] args) {
        FSHelper helper = new FSHelper();
        helper.init();
        System.out.println("===========================");
        FSHelperSolution helper2 = new FSHelperSolution();
        helper2.init();
        System.out.println("===========================");
    }
}
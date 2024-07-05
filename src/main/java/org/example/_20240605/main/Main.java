package org.example._20240605.main;

import org.example._20240605.taks.Test;
import org.example._20240605.taks.sub_test.SubTest;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        SubTest subtest = new SubTest();
//        System.out.println(test.getTask());
//        System.out.println(subtest.getSubTask());
        test.setTask(100);
        System.out.println(test.getTask());
    }
}

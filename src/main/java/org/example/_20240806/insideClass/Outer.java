package org.example._20240806.insideClass;

public class Outer {void outerMethod() {
    System.out.println("inside outerMethod");
}
    class Inner {
        public void show() {
            System.out.println("In a nested class method");
        }
        public int sum (int name1, int name2) {
            return name1 + name2;

        }
    }
}

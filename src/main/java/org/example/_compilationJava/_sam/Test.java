package org.example._compilationJava._sam;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name + " " + cat.age);
        Cat tom = new Cat("Tom");
        System.out.println(tom.name + " " +  tom.age);
        Cat jerry = new Cat("Jerry", 5);
        System.out.println(jerry.name + " " + jerry.age);
    }
    }


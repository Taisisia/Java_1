package org.example._compilationJava;

public class TestCompilation {
    public static void main(String[] args) {

    }

    String str = new String("Java");
System.out.println(str);

    //StringBuilder sb = new StringBuilder("Hello from string builder");
//    System.out.println(sb);
    public class Student {
        String name;
        int age;
        String group;

        //    default constructor
        public Student() {
        }

        //    constructor with name param
        public Student(String name) {
            this.name = name;
        }

        //    constructor with all params
        public Student(String name, int age, String group) {
            this.name = name;
            this.age = age;
            this.group = group;
        }
    }
}
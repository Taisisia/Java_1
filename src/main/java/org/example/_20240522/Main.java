package org.example._20240522;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        print(11, "String");
        int result = sum(15, 5);
        System.out.println("Sum result: " + result);
    }

    public static void print(int num, String name) {
        System.out.println("Hello from print");
        System.out.println(num + " " + name);
    }

    public static int sum(int numA, int numB) {
        return numA + numB;
    }
}

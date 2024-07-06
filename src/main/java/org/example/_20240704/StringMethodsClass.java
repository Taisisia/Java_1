package org.example._20240704;

public class StringMethodsClass {

    public static void main(String[] args) {
        // String pool
//        String str = "I learn Java";
        // Heap
        String str = new String("I learn Java");

        System.out.println("Length of " + str + " is " + str.length());
        System.out.println("Our string " + str + " starts with symbol " + str.charAt(0));
        System.out.println("Our string " + str + " ends with symbol " + str.charAt(str.length() - 1));
        System.out.println(str.substring(8));
        System.out.println(str.substring(2, 7));
    }
}

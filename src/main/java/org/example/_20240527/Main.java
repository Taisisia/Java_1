package org.example._20240527;

public class Main {
    public static void main(String[] args) {
        findEvenOdd(2);
        findEvenOdd(4);
        findEvenOdd(5);
    }
    public static void findEvenOdd(int num) {
        if (num / 2 == 0) {
            System.out.println(num+" is even");
        }
        else {
            System.out.println(num+"is odd");
        }
    }
}

package org.example._20240528;

import java.util.Random;
import java.util.Scanner;

public class RelationOperatorClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input start value(min 0):");
        int startFirst = sc.nextInt();
        System.out.println("Input end value(max 10):");
        int endFirst = sc.nextInt();
        System.out.println("Input start value(min 5):");
        int startSecond = sc.nextInt();
        System.out.println("Input end value(max 15):");
        int endSecond = sc.nextInt();
        Random random = new Random();
        int value = random.nextInt(startFirst-10, endSecond + 10);
        System.out.println("Random point is " + value);
        boolean result = (value >= startFirst && value <= endFirst) ||
                (value >= startSecond && value <= endSecond);}
}

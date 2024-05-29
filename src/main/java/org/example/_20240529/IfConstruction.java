package org.example._20240529;

import java.util.Random;

public class IfConstruction {
    public static void main(String[] args) {
//        int num = 11;
//        if (num %2 == 0) {
//            System.out.println( "Even");
//        }
//        else {
//            System.out.println("Odd");
//        }
//        for (int i =0; i<+num; i++) {
//            if (num%2 ==0) {
//                System.out.println("Even");
//                break;
//            }
//            System.out.println("Out of if");
//        }
//    }
        int startFirst = 1;//sc.nextInt();
        //        System.out.println("Input end value(max 10):");
        int endFirst = 10; //sc.nextInt();
        //        System.out.println("Input start value(min 5):");
        int startSecond = 5;//sc.nextInt();
        //        System.out.println("Input end value(max 15):");
        int endSecond = 15; //sc.nextInt();
        Random random = new Random();
        int value = random.nextInt(startFirst - 10, endSecond + 10);
        System.out.println("Random point is " + value);
        getResult(startFirst, endFirst, startSecond, endSecond, value);
    }

    public static void getResult(int startFirst, int endFirst, int startSecond, int endSecond, int value) {
        if ((value >= startFirst && value <= endFirst) && (value >= startSecond && value <= endSecond)) {
            System.out.println("Both ranges contain value " + value);
        } else if ((value >= startFirst && value <= endFirst) && !(value >= startSecond && value <= endSecond)) {
            System.out.println("Fist range contains value: " + value);
        } else if (!(value >= startFirst && value <= endFirst) && (value >= startSecond && value <= endSecond)) {
            System.out.println("Second range contains value: " + value);
        } else {
            System.out.println("Current value is out of our ranges");
        }
    }
}

//public static void main(String[] args) {


////    nested If
//    public static void getResult ( int startFirst, int endFirst, int startSecond, int endSecond, int value) {
//            if (value >= startFirst && value <= endSecond) {
//                if ((value >= startFirst && value <= endFirst) && (value >= startSecond && value <= endSecond)) {
//                    System.out.println("Both ranges contain value " + value);
//                } else if ((value >= startFirst && value <= endFirst) && !(value >= startSecond && value <= endSecond)) {
//                    System.out.println("Fist range contains value: " + value);
//                } else if (!(value >= startFirst && value <= endFirst) && (value >= startSecond && value <= endSecond)) {
//                    System.out.println("Second range contains value: " + value);
//                }
//            } else {
//                System.out.println("Current value is out of our ranges");
//            }





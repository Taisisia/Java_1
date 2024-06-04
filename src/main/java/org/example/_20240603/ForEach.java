package org.example._20240603;

import java.util.Objects;

public class ForEach {
    public static void main(String[] args) {
        double arr [] = {10.05, 2, 3.11, 4.09, 51};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " - " + arr[i]);
        }

        System.out.println();

        for(double item: arr) {
            System.out.print(item + " ");
        }
        System.out.println();


        String arr1 [] = {"Ta", "Rf", "Po", "MJ","JT"};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(i + " - " + arr1[i]);
        }
        System.out.println("__________________________________________");

        System.out.println();

        for(String item: arr1) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("__________________________________________");

        String [] fruits = {"apple", "lemon", "orange", "kiwi"};
        for (int i = 0; i < fruits.length; i++) {
//            System.out.println(fruits[i]);
            if (Objects.equals(fruits[i], "kiwi")) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
        for(String fruit: fruits) {
            if (Objects.equals(fruit, "kiwi")) {
                System.out.println("We have a kiwi");
            } else {
                System.out.println("We don't have kiwi");
            }
        }

    }
}

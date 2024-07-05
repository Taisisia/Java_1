package org.example._20240606.MassivArr;

import java.util.Arrays;

public class Array {


    public static void main(String[] args) {

        int[] arrInt = new int[10];
        int[] arrNewInt = {1, 2, 3, 4, 10};
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arrInt));

        for (int i = 0; i < arrNewInt.length; i++) {
            System.out.print(arrNewInt[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arrNewInt));

//        arrInt[10] = 100;
//        arrNewInt[10] = 100;
        for (int i = 0; i < arrNewInt.length; i++) {
            System.out.println(i + " - " + arrNewInt[i]);
        }
        System.out.println();
        System.out.println(Arrays.toString(arrNewInt));
        System.out.println(arrNewInt[0]);
    }
}

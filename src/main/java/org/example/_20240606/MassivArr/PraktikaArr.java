package org.example._20240606.MassivArr;

import java.util.Arrays;

public class PraktikaArr {
    public static void main(String[] args) {
//        Создайте массив L = 10
//Инициализируйте массив числами от 1 до 10 используя способ литерала
//Выведите на консоль элемент из второй ячейки
//Выведите на консоль элемент из предпоследней ячейки
//Распечатайте на консоль все элементы из ячеек массива Используйте инструкцию .print()
//Замените все элементы в данном массиве на значение “-1”
//Распечатайте на консоль все элементы из ячеек массива. Используйте инструкцию .print()

        //        Создайте массив L = 10
        int [] arrInt = new int[10]; // array
        int [] arrNewInt = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // literal array
        System.out.println(arrNewInt[1]);

        //Выведите на консоль элемент из предпоследней ячейки
        System.out.println(arrNewInt[arrNewInt.length -2]);
        for (int i = 0; i < arrNewInt.length; i++) {
            System.out.print(arrNewInt[i] + " ");
        }
        System.out.println();
        //Замените все элементы в данном массиве на значение “-1”
        for (int j = 0; j < arrNewInt.length; j++) {
            arrNewInt[j] = - 1;
            System.out.print(arrNewInt[j] + " ");
        }
        int [] arrL = new int[10];
        int[] arrLit = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i < arrL.length; i++) {
//            arrL[i] = i + 1;
//            System.out.print(arrL[i] + " ");
//        }
//        System.out.println();
        System.out.println(Arrays.toString(arrLit));
        for(int j = 0; j <arrLit.length; j++) {
            arrLit[j] = -1;
        }
        System.out.println(arrLit[1]);
        System.out.println(arrLit.length -2);
    }}

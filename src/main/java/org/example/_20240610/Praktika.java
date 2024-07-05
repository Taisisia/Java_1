package org.example._20240610;

import java.util.Arrays;

public class Praktika {

//        Вычислить сумму модулей элементов массива  (для вычисления модуля используйте Math.abs() )
        public class PracticTasks {
            public static void main(String[] args) {

                int[] arr1 = {3, 6, 9, -23, 48, -3, 2};
                System.out.println(getSumAbs(arr1));

            }
            //Вычислить сумму модулей элементов массива
            // (для вычисления модуля используйте Math.abs() )
            public static int getSumAbs(int[] arr){
                int sum = 0;
                for (int i = 0; i < arr.length; i++){
                    int absolute = Math.abs(arr[i]);
                    sum = sum + absolute;

                }
                return sum;
            }
//            В массиве целых чисел определить два наименьших элемента. Они могут быть как равны
//между собой (оба являться минимальными), так и различаться
//    System.out.println(Arrays.toString(getTwoLessElements(arrNew)));
    //В массиве целых чисел определить два наименьших элемента. Они могут быть как равны
    //между собой (оба являться минимальными), так и различаться
    public static int[] getTwoLessElements(int[] arr){
        int minNum1 = arr[0];
        int minNum2 = Integer.MAX_VALUE;
        int min1index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minNum1){
                minNum1 = arr[i];
                min1index = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minNum2 && i != min1index){
                minNum2 = arr[i];
            }
        }
        int[] res = {minNum1, minNum2};
        return res;
//        return new int[]{minNum1, minNum2};

//        Задача
//Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива, вернув новый массив нужной длинны.
//
//Задача
//Напишите программу которая выводит на конслоь простые числа в промежутке от 2 до 100 включительно.
//
//Задача
//В массиве из целых чисел найти индекс минимального из четных положительных элементов, при их отсутствии вывести -1.
//
//Задача
//Вычислить сумму положительных элементов массива А после первого нуля (при наличии нуля).
//
//Задача
//Отсортировать массив а[0..n] по возрастанию и по убыванию. Без использования Arrays.sort()
//
//Задача
//Дано два массива. Сравнить их.
    }
        }
    }


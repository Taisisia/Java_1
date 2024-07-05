package org.example._20240607.praktika;

import java.util.Arrays;

public class Main {
    //    В массиве найти максимальный элемент
    public static void main(String[] args) {
        int[] arrNew = {66, -5, -12, 100, -3};
        System.out.println(getMax(arrNew));
        System.out.println(getMaxIndex(arrNew));
        System.out.println(getMaxIndex2(arrNew));
        System.out.println(getSumEvenPositive(arrNew));
        System.out.println(getAverage(arrNew));
//        System.out.println(getLessThanAverage(arrNew));
        System.out.println(getLessThanAverage3(arrNew));
    }

    public static int getMax(int[] arr) {
        int maxNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

//В массиве найти максимальный элемент с четным индексом
    public static int getMaxIndex(int[] arr) {
        int maxIndex = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > maxIndex && j % 2 == 0) {
//           проверка на четность j % 2 ==0
                maxIndex = arr[j];
            }
        }
        return maxIndex;
    }

    public static int getMaxIndex2(int[] arr) {
        int maxIndex = arr[0];
        for (int j = 2; j < arr.length; j += 2) {
//            j = j + 2
            if (arr[j] > maxIndex) {
                maxIndex = arr[j];
            }
        }
        return maxIndex;
    }

    //    В массиве, содержащем положительные и отрицательные целые числа,
//вычислить сумму четных положительных элементов
    public static int getSumEvenPositive(int[] arr) {
        int sum = 0;
        for (int s = 0; s < arr.length; s++) {
            if (arr[s] % 2 == 0) {
                if (arr[s] > 0) {
                    sum = sum + arr[s];
                }
            }
        }
        return sum;
    }

    //    Найти среднее арифметическое от всех элементов массива
    public static double getAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return (double) sum / arr.length;
    }
//    Найти в массиве те элементы, значение которых меньше среднего арифметического,
//взятого от всех элементов массива
//    public static int getLessThanAverage(int[]arr) {
//        double average = getAverage(arr);
////        Создаем счетчик
//        int count =0;
//
//      for (int i=0; i<arr.length; i++){
//          if (arr[i]<average){
//              count++;
//          }
//      }
//      int []result = new int [count];
//      int count2 =0;
//      for (int i =0; i <arr.length; i++){
//          if (arr[i]<average){
//           result [count2] = arr [i];
//           count2++;
//          }
//      }
//        return result;
//    }
    public static int[] getLessThanAverage2(int[] arr) {
    double average = getAverage(arr);
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < average) {
            count++;
        }
    }
    int[] result = new int[count];
    int count2 = 0;
    for (int i = 0; i < arr.length; i++){
        if (arr[i] < average) {
            result[count2]= arr[i];
            count2++;
        }
    }
    return result;
}
//Вычислить сумму модулей элементов массива  (для вычисления модуля используйте Math.abs() )
//
//    Найти номер минимального по модулю элемента массива
//
//    В массиве целых чисел определить два наименьших элемента. Они могут быть как равны
//    между собой (оба являться минимальными), так и различаться

//Найти в массиве те элементы, значение которых меньше среднего арифметического,
//взятого от всех элементов массива
public static int[] getLessThanAverage3(int[] arr) {
    double average = getAverage(arr);

    int[] result = new int[arr.length-1];
    int count2=0;
    for (int i = 0; i < arr.length; i++){
        if (arr[i] < average) {
            result[count2]= arr[i];
            count2++;
        }
    }
    result = Arrays.copyOf(result, count2);
    return result;
}
}

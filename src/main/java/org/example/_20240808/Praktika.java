package org.example._20240808;

import java.util.Arrays;
import java.util.Scanner;

public class Praktika {
    public static void main(String[] args) {
// Получить от пользователя набор данных ( 6 целочисленных значений)
// Сохранить полученные данные в массив
// Получить от пользователя ключевой элемент
// Реализовать метод линейного поиска ключевого элемента в массиве, метод должен вернуть индекс элемента или -1
// Если элемент существует, вывести на консоль: Элемент в n-индексе, иначе Элемент не найден.
// Проанализируйте написанный код используя режим Дебаггер
        Scanner scanner = new Scanner(System.in);
        int [] arrSix = new int[6];
        for (int i = 0; i < arrSix.length; i++){
            System.out.println("Введите целочисленных значений");
           int num = scanner.nextInt();
            arrSix[i] = num;
        }

        System.out.println(Arrays.toString(arrSix));

        // Получить от пользователя ключевой элемент

        System.out.println("Введите ключевой элемент для поиска");
        int key = scanner.nextInt();
        int index = linearSearch(arrSix, key);
        if ( index != -1  ) {
            System.out.println("Элемент  " + key + "  в " + linearSearch(arrSix, key) + " индексе");
        }
        else  System.out.println("Элемент не найден");
    }

    public static int linearSearch(int[] arr, int key){
        for (int i=0; i< arr.length; i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}

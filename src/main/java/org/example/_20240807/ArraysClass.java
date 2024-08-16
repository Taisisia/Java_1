package org.example._20240807;

import java.util.Arrays;
import java.util.Random;

public class ArraysClass {
    public static void main(String[] args) {
//        copyOf копирование элементов массива
    int []arr1 = {1, 2, 3, 4, 5};
    int [] arrCopy = Arrays.copyOf(arr1,3);// копирование элементов массива
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arrCopy));

        // Range копирует диапазон элементов с какого индекса по какой индекс копируем второй индекс не включительно
        int [] arrRange = Arrays.copyOfRange(arr1, 1, 3);
        System.out.println();


        // Arrays.sort сортировка
        Random random = new Random(100);
        int [] userArr = new int[10];
        for (int i =0; i < userArr.length; i++){
            userArr [i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(userArr));
        Arrays.sort( userArr);

        System.out.println(Arrays.toString(userArr));
}
}

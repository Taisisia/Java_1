package org.example._20240808;

import java.util.Arrays;

public class BubbleSortPraktika {
    public static void main(String[] args) {
//Дан массив {22, 3, 4, 2, 50}
//Реализуйте метод bubbleSort(int[] array)
//Выведите на консоль массив до и после сортировки
//Проанализируйте код
      int [] array = {22, 3, 4, 2, 50};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] array){
        boolean sorter = false;
        int temp;
        while (!sorter) {
            sorter = true;
            for (int i=0; i <array.length-1; i++){
                if (array[i]>array[i+1]){
                    temp = array[i];
                    array[i]=array[i+1];
                    array[i+1] = temp;
                    sorter = false;

                }
            }


        }
    }
}

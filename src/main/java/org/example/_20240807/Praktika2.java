package org.example._20240807;

import java.util.Arrays;
import java.util.Random;

public class Praktika2 {
    public static void main(String[] args) {

// Создайте массив из всех нечётных чисел от 1 до 99.
//Выведите его на экран в строку в обратном порядке

        int [] numOdd = new int[50];
        int index = 0;

       for (int i=1; i < 100; i++){
           if (i % 2 == 1){
           numOdd [index] = i;
           index++;
           }
       }
        System.out.println(Arrays.toString(numOdd));
       for ( int i = numOdd.length-1; i >= 0; i--) {
           System.out.print(numOdd[i] + " ");
       }
// Создайте массив из 15 случайных целых чисел из отрезка [0;9]
//Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.


        Random random = new Random();
        int [] numRandom = new int[15];
        for (int i =0; i < numRandom.length; i++) {
            numRandom[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(numRandom));
        int numEven=0;
        for (int i =0; i < numRandom.length; i++){


        }

    }

}

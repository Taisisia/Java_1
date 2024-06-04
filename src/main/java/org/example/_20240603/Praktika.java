package org.example._20240603;

import java.io.OutputStream;
import java.util.Random;

public class Praktika {
    public static void main(String[] args) {
//Загадать случайно 100 целых чисел в диапазоне от -100 до 100.
//Вычислить процент положительных чисел,
// процент отрицательных чисел и
//процент нулей.
// Вычислить процент чётных чисел
// и процент нечётных.
        Random random = new Random();
        int min = -100;
        int max = 100;
        int pos = 0;
        int neg = 0;
        int odd = 0;
        int notOdd = 0;
        int zero = 0;
        for (int i = 0; i < 100; i++) {
            int randomNum = random.nextInt(min, max);
            if ( randomNum < 0) {
                neg++;
            } else if ( randomNum > 0 ){
                pos++;
            }
            else {
                zero++;
            }
            if (randomNum % 2 == 0) {
                notOdd++;
            } else {
                odd++;
            }
        }
        System.out.println("Позитиных " + pos);
        System.out.println("Негативных " + neg);
        System.out.println("Четных " + notOdd);
        System.out.println("Не чётных " + odd);
        System.out.println("Нулевых " + zero);
    }

    }

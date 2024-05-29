package org.example._20240528h;

import java.util.Scanner;

public class HomeWorkFirst {
    public static void main(String[] args) {
//Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//Числа могут быть, как целочисленные, так и дробные.

//Например :
//ввод : m=10.5, n=10.45
//вывод: Число 10.45 ближе к 10.
        int num = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double m = sc.nextDouble();
        System.out.println("Введите второе число: ");
        double n = sc.nextDouble();

        double deferenceM = Math.abs(num - m);
        double deferenceN = Math.abs(num - n);

        if ( deferenceM > deferenceN ) {
            System.out.println("Ближайшее число к 10: " + n);
        }
        else System.out.println("Ближайшее число к 10: " + m);

    }
}

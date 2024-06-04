package org.example._20240530h;

import javax.swing.*;
import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
//        Реализуйте программу, которая попросит пользователя ввести три целых числа
//        (используйте сканер) и напечатает максимум из трех чисел.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();
        System.out.println("Введите третее число");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Максимумально первое число " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Максимумально второе число " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Максимумально третье число " + num3);
        }
        else if ( num1 == num2 && num2==num3) {
            System.out.println("Все числа равны ");
        }
    }
}

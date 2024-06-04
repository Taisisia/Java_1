package org.example._20240530h;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
//        Реализуйте программу, которая попросит пользователя ввести год
//        и напечатать этот год isLeap (високосный) или нет.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
        int numDays =0;
        if (((year %4 == 0) &&! (year %100 ==0)) || (year % 400==0))
        {
            numDays=29;
            System.out.println("Этот год высокосный");
        }
        else {
            numDays = 28;
            System.out.println("Этот год не высокосный");

        }
    }
}

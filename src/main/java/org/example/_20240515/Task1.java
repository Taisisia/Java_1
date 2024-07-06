package org.example._20240515;

public class Task1 {
    //Дано трехзначное число. Вывести на экран все цифры этого числа
    //Пример: 345
    //Вывод в консоль: Число 345 -> 3, 4, 5
    public static void main(String[] args) {
        int number = 783;

        int num1 = number / 100;
        int num2 = (number - (num1 * 100)) / 10;
        // variant 2; int num2 = (number % 100)/10
        int num3 = number % 10;
        System.out.println("Число " + number + " -> " + num1 + ", " + num2 + ", " + num3);


    }
}

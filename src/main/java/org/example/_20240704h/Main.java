package org.example._20240704h;

import org.example._20240531.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Создайте строку через new - I study Basic Java!
        String string = new String("I study Basic Java!");

        // Распечатать пред-последний символ строки. Используем метод String.charAt().
        System.out.println("Пред-последний символ строки: " +string +": "+ string.charAt(string.length() - 2));

        // Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println("Строка содержит подстроку “Java”: "+string.contains("Java"));

        // Вырезать строку Java c помощью метода String.substring().
        System.out.println("Вырезать строку Java из " + string +":" + string.substring(13, 18));

        // Заменить все символы “а” на “о”. c помощью метода String.replace()
        System.out.println("Заменить все символы “а” на “о”: " + string.replace("a", "o"));

        // Преобразуйте строку к верхнему регистру.
        System.out.println("Преобразуйте строку к верхнему регистру: " + string.toUpperCase());

        // Преобразуйте строку к нижнему регистру.
        System.out.println("Преобразуйте строку к нижнему регистру: "+ string.toLowerCase());

//        Создайте методы с математическими операциями +, -, *, /
//        Каждый метод принимает два числа в параметрах и возвращает результат
//        Вызовите все методы в main
//        Результат распечатайте в консоль
        System.out.println("Сумма сложение чисел " + addition (5, 10)); //addition сложение
        System.out.println("Разница вычитания чисел " + subtraction (100, 10)); //subtraction вычитание
        System.out.println("Произведение чисел " + multiply (6, 10));  // multiply умножение
        System.out.println("Частное чисел " + divide (80, 20)); // divide деление

//        Напишите программу, которая запрашивает имя пользователя и выводит на экран «Добрый день <…….. !>».
        Scanner scannerName = new Scanner(System.in);
        System.out.println("Введите свое имя");
        String userName = scannerName.nextLine();
        System.out.println("Добрый день " + userName + "!");

//
// Улучшите программу, которая запрашивает имя пользователя и выводит на экран
//«Добрый день  <…….. !>».
//«Ваше имя начинается с символа <.> и заканчивается на символ <.>».
        System.out.println("«Ваше имя начинается с символа "+ userName.charAt(0)+ " и заканчивается на символ " + userName.charAt(userName.length() - 1));
    }
    public static int addition (int a, int b ) { // addition сложение
      return Math.addExact(a, b);
    }
    public static int subtraction  (int a, int b ) { //subtraction вычитание

        return Math.subtractExact(a, b);
    }
    public static int multiply  (int a, int b ) { // multiply умножение

        return  Math.multiplyExact(a, b);
    }
    public static int divide  (int a, int b ) { // divide деление
        return  Math.divideExact(a, b);
    }
}

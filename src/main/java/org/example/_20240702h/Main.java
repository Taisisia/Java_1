package org.example._20240702h;

import org.example._20240531.main;

public class Main {
    public static void main(String[] args) {
//   1. В методе main инициализировать все примитивные типы и не примитивные типы.
//
//
// Вывести их результат в консоль:
//        char: G
//        int: 89
//        byte: 4
//        short: 56
//        float: 4.7333436
//        double: 4.355453532
//        long: 12121
//
//
//        Character: G
//        Integer: 89
//        Byte: 4
//        Short: 56
//        Float: 4.7333436
//        Double: 4.355453532
//        Long: 12121

        //char: G
        char charValue = 'G';

        //int: 89
        int intValue = 89;

        //byte: 4
        byte byteValue = 4;

        //short: 56
        short shortValue = 56;

        //float: 4.7333436
        float floatValue = 4.7333436f;

        //double: 4.355453532
        double doubleValue = 4.355453532;

        //long: 12121
        long longValue = 12121L;

        //

        //Character: G
        Character charObj = 'G';

        //Integer: 89
        Integer integerObj = 89;

        //Byte: 4
        Byte byteObj = 4;

        //Short: 56
        Short shortObj = 56;

        //Float: 4.7333436
        Float floatObj = 4.7333436F;

        //Double: 4.355453532
        Double doubleObj = 4.355453532;

        //Long: 12121
        Long longObj = 12121L;

        System.out.println("char: " + charValue);
        System.out.println("int: " + intValue);
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("long: " + longValue);
        System.out.println("Character: " + charObj);
        System.out.println("Integer: " + integerObj);
        System.out.println("Byte: " + byteObj);
        System.out.println("Short: " + shortObj);
        System.out.println("Float: " + floatObj);
        System.out.println("Double: " + doubleObj);
        System.out.println("Long: " + longObj);

//        Дано трехзначное число. Вывести на экран все цифры этого числа
//        Пример: 345
//        Вывод в консоль: Число 345 -> 3, 4, 5

        int number = 783;

        int num1 = number / 100;
        int num2 = (number - (num1 * 100)) / 10;
        // variant 2; int num2 = (number % 100)/10
        int num3 = number % 10;
        System.out.println("Число " + number + " -> " + num1 + ", " + num2 + ", " + num3);



    }
}

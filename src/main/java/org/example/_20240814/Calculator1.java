package org.example._20240814;

import java.util.Locale;
import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {


//    Напишите программу "Калькулятор", производящую вычисления с двумя числами c дробной частью
//Тип данных вводимых аргументов должен быть Double. 
//Пользователь должен ввести с клавиатуры знак выполняемой математической операции в формате строки, а затем программа должна преобразовать введенную строку в значение переменной типа Char (получить из строки первый символ методом string.charAt(0);).
//Требуется произвести проверку введенных данных:
//Если пользователь ввёл знак операции, отличный от +, -, *, / - выводить сообщение о том, что указанная операция не поддерживается программой.
//Если пользователь хочет выполнить операцию деления и в качестве значения второго аргумента ввёл значение 0, то программа должна вывести сообщение о том, что на 0 делить нельзя.
//В обеих ситуациях программа должна прекращать дальнейшую работу.
//<значение переменной результата>.
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Введите знак +, -, *, /");
        String sing = scanner.next();
        char charAt = sing.charAt(0);
        if (charAt != '+' && charAt != '-' && charAt != '*' && charAt != '/') {
            System.out.println("операция не поддерживается программой.");
            return;
        }

        System.out.println("Введите первое число");
        double numFirst = scanner.nextDouble();

        System.out.println("Введите второе число");
        double numSecond = scanner.nextDouble();



double res = 0;
if (charAt == '+'){
    res = numFirst + numSecond;
} else if (charAt == '-') {
    res = numFirst - numSecond;
} else if (charAt == '*') {
    res = numFirst * numSecond;
} else if (charAt == '/') {
    if ( numSecond ==0 && charAt == '/' ) {
        System.out.println("на 0 делить нельзя.");
        return;
    }
    else  {
        res = numFirst / numSecond;}

        }
        System.out.println(numFirst + " " + charAt + " " + numSecond + " = " + res);
        System.out.printf("%.2f %s %.2f = %.2f", numFirst, charAt, numSecond,  res);
        }
    }




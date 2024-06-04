package org.example._20240531;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Написать программу калькулятор,
//        которая через сканнер принимает 3 аргумента,
//        первое число, знак оператора и второе число,
//        и совершает над ними операцию, используя оператор switch
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double numFirst = sc.nextDouble();
        System.out.println("Введите знак действия + - * /");
        sc.nextLine();
        String lineUser = sc.nextLine();

        if (lineUser.length()>1) {
            System.out.println("Error");
            System.out.println("Введено большое количество символов");
            System.exit(0);
        }
//        char operator = sc.nextLine().charAt(0);
        char operator = lineUser.charAt(0);
        System.out.println("Введите третье число: ");
        double numSecond= sc.nextDouble();

        System.out.println("Результат действия = " + calcNum(numFirst, operator, numSecond));//вызываем метод
    }
    public static double calcNum (double num1,char operator, double num2) {
        double res = 0;
        switch (operator) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                if (num2 ==0) {
                    System.out.println("Ошибка деления на 0");
                    System.exit(0);
                }
                res = num1 / num2;
                break;
            default:
                System.out.println("Error");
        }
        return res;
    }
}


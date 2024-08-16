package org.example._20240814;

import java.util.Scanner;

public class Util {
    private static Scanner scanner = new Scanner(System.in);

    public static char getOperation() {
        char operation;
        do {
            System.out.println("Введите знак +, -, *, /, %");
            String operationInput = scanner.next();
            operation = operationInput.charAt(0);
        }
        while (operation != Constant.SIGN_PLUS && operation != Constant.SIGN_MINUS && operation != Constant.SIGN_MULTI && operation != Constant.SIGN_DIV && operation != Constant.SIGN_PROC);
        {
            System.out.println("операция не поддерживается программой.");

        }
        return operation;
    }

                         // метод для операций
    public static double getNum(boolean isChek, char operation) {

        double argument;
        if (isChek) {
            do {
                System.out.println("Введите число: ");
                argument = scanner.nextDouble();
            }
            while ((operation == '/' || operation == '%') && argument == 0);

        } else {
            System.out.println("Введите число: ");
            argument = scanner.nextDouble();
        }
        return argument;
    }

    //    метод который выполняет операцию и получает резельтат
    public static double getResalt(double numFirst, double numSecond, char operation) {
        double res = 0;
        switch (operation) {
            case Constant.SIGN_PLUS:
                res = numFirst + numSecond;
                break;
            case Constant.SIGN_MINUS:
                res = numFirst - numSecond;
                break;
            case Constant.SIGN_MULTI:
                res = numFirst * numSecond;
                break;
            case Constant.SIGN_DIV:
                res = numFirst / numSecond;
                break;
            case Constant.SIGN_PROC:
                res = numFirst % numSecond;
                break;
        }
        return res;
    }

    public static void printResalt(double numFirst, char operation, double numSecond, double res) {
        System.out.println(numFirst + " " + operation + " " + numSecond + " = " + res);
        System.out.printf("%.2f %s %.2f = %.2f", numFirst, operation, numSecond, res);
    }

}

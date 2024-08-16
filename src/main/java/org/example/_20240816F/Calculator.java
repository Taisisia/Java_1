package org.example._20240816F;

import org.example._20240814.Constant;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        String needNextCalc;
        char operation;
        double argumentOne;
        double argumentTwo;
        double res;
        double[] arr;
        int count;
        do {
            count = org.example._20240816F.Util.getCount();// получили кол-во элементов
            arr = new double[count]; // создали массив
            for (int i =0; i < count; i++){// заполнили массив аргументами которые вводит пользователь
                arr [i] = org.example._20240816F.Util.getNum();
            }
                operation = org.example._20240814.Util.getOperation();
//            argumentOne = org.example._20240814.Util.getNum(false, operation);
//            argumentTwo = org.example._20240814.Util.getNum(true, operation);
            res = org.example._20240816F.Util.getResalt(arr, operation);
            org.example._20240816F.Util.printResalt(arr, operation, res);

            do {
                System.out.println(" ");
                System.out.println("Хотите продолжить? (Y/N)");
                needNextCalc = scanner.next();
            }
            while (!org.example._20240814.Constant.ANS_YES.equalsIgnoreCase(needNextCalc) && !org.example._20240814.Constant.ANS_NO.equalsIgnoreCase(needNextCalc));
        }
        while (Constant.ANS_YES.equalsIgnoreCase(needNextCalc));
    }
}

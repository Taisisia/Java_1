package org.example._20240816S;

import org.example._20240814.Constant;

import java.util.Locale;
import java.util.Scanner;

public class Calculator2 {

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
            count = Util2.getCount();// получили кол-во элементов
            arr = new double[count]; // создали массив
            for (int i = 0; i < count; i++) {// заполнили массив аргументами которые вводит пользователь
                arr[i] = Util2.getNum();
            }
            operation = org.example._20240814.Util.getOperation();
            res = Util2.getResalt(arr, operation);
            Util2.printResalt(arr, operation, res);

            do {
                System.out.println(" ");
                System.out.println("Хотите продолжить? (Y/N)");
                needNextCalc = scanner.next();
            }
            while (!Constant.ANS_YES.equalsIgnoreCase(needNextCalc) && !Constant.ANS_NO.equalsIgnoreCase(needNextCalc));
        }
        while (Constant.ANS_YES.equalsIgnoreCase(needNextCalc));
    }
}

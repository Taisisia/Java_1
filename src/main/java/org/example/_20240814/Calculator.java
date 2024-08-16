package org.example._20240814;

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
        do {
            operation = Util.getOperation();
            argumentOne = Util.getNum(false, operation);
            argumentTwo = Util.getNum(true, operation);
            res = Util.getResalt(argumentOne, argumentTwo, operation);
            Util.printResalt(argumentOne,operation, argumentTwo, res);
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

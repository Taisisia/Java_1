package org.example._20240531;

import java.util.Scanner;

public class TaskStringSecond {
    public static void main(String[] args) {
//      5.	Дана строка. Показать третий, шестой, девятый и так далее символы.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String str1 = scanner.nextLine();
        System.out.println(getSymbols(str1));
    }

    public static String getSymbols(String string)  {
        String stringStr = "";
        for (int i =2; i<=string.length();i+=3){
            stringStr = stringStr + string.charAt(i);

        }
        return stringStr;
    }
}


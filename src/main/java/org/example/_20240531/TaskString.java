package org.example._20240531;

import java.util.Scanner;

public class TaskString {
    public static void main(String[] args) {
//        4.	Дана строка. Показать номера символов,
//        совпадающих с последним символом строки.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String str1 = scanner.nextLine();
        System.out.println(getNumberOfChar(str1));
    }

    public static String getNumberOfChar(String string) {
        char lastElement = string.charAt(string.length() - 1);
        String indexesOfElement = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == lastElement) {
                indexesOfElement = indexesOfElement + i;
            }
        }
        return indexesOfElement;
    }
}

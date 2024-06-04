package org.example._20240530h;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

//      Создайте две переменные isEdekaOpen и isReweOpen,
//  значения которых зависят от того, открыты магазины или нет.
//      Реализует логический метод canBuy,  возвращающий boolean
//      Значение этой переменной должно быть true,
//  если хотя бы один магазин открыт, иначе false.
//      Отобразите строку «Я могу купить еду, это ……» и значение.

        Scanner sc = new Scanner(System.in);

        System.out.println("Магазин Edeka открыт?");
        boolean isEdekaOpen = sc.nextBoolean();

        System.out.println("Магазин Rewe открыт?");
        boolean isRewOpen = sc.nextBoolean();
        canBuy(isEdekaOpen,isRewOpen);
//        System.out.println(canBuy(isEdekaOpen,isRewOpen));
    }

    public static boolean canBuy(boolean isEdekaOpen, boolean isRewOpen) {

        if (isEdekaOpen == true && isRewOpen == true) {
            System.out.println("Я могу купить еду, это Edeka и Rewe");
            return true;
        } else if (isEdekaOpen == true && isRewOpen == false) {
            System.out.println("Я могу купить еду, это Edeka");
            return true;
        } else if (isEdekaOpen == false && isRewOpen == true) {
            System.out.println("Я могу купить еду, это Rewe");
            return true;
        } else {
            System.out.println("Я не могу купить еду");
            return false;
        }
    }
}


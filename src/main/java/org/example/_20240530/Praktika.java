package org.example._20240530;

public class Praktika {
    public static void main(String[] args) {
//        Создать переменную int num, приносить ей любое значение и проверить,
//        делится ли она на 3 без остатка.
//        Проверку сделать с помощью if-else
//        и с помощью тернарного оператора.

        int num = 10;
        if (num % 3 == 0) {
            System.out.println("число делится на 3");
        } else System.out.println("число делится не 3");
        System.out.println( "* тернарный оператор *");
        System.out.println(num % 3 == 0 ? "число делится на 3" :"число делится не 3" );;
    }
}

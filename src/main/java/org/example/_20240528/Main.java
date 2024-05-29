package org.example._20240528;

public class Main {
    public static void main(String[] args) {
//        int num = 10;
//        System.out.println("Original value: " + num);
////        System.out.println("Convert value: " + (-num));
////        num = num++;
////        num++;
////        predinkrement
//        System.out.println("Increment: " + (num++));
//
////        int num1 = num;
////        System.out.println("num1 = " + num1);
//
////        postinkrement
//        for(int i =2; i > 0; i--) {
//            System.out.println("i = " +i);
////        }
////        for (int i = 0; i < 5; ++i) {
////            System.out.println("i = " + i);
//        }

////        praktika 1
//        int p = 14;
//         p = -p ;
//        System.out.println("unarn minus" + p);
//        int a = 5;

//  primer 1
////        int i = a++ + ++a + ++a;
//////                5   + 7   + 8
//        int i= ++a + ++a + a++;
////                6  + 7 + 7
//        System.out.println(i);
        int k = 100;
         int post = k++ + k--;
        System.out.println( "resalt post= " + post);

        int pred = ++k + --k ;

        System.out.println( "resalt pred= " + pred);

//        Relation operator
//        Создайте три переменные
//        Сравните поочередно каждые из созданных переменных используя реляционные операторы
//        Результат распечатайте в консоль
        int a = 5;
        int b = 50;
        int c = 500;

        System.out.println("a == b " + (a == b));
        System.out.println("a != c " + (a != c));
        System.out.println("b == c " + (b == c));
        System.out.println("a < b " + (a < b));
        System.out.println("b > c " + (b > c));
        System.out.println("c >= b " + (c >= b));
    }
}

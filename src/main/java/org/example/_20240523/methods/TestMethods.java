package org.example._20240523.methods;

public class TestMethods {
    public static void main(String[] args) {
//Создайте метод getSum(int a, int b), который ничего не возвращает, и печатает результат суммы двух полученных чисел в консоль.
//  getSum(11, 22);
        System.out.println(getReturnSum(4, 44));
    }
//    }
//
//    public static void getSum(int a, int b) {
//        System.out.println(a + " + " + b + " = " + (a+b));
//
//       2. Создайте метод getReturnSum(int a, int b), который возвращает результат - сумма двух чисел, а печать в консоль производит вызывающий метод.

       public static int getReturnSum(int a, int b){
           return a + b;
       }
        }


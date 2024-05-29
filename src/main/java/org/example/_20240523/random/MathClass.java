package org.example._20240523.random;

public class MathClass {
    public static void main(String[] args) {
        int min = 10;
        int max = 100;
        System.out.println((int)(Math.random()*(max-min+1)+min));
        System.out.println(Math.random());
    }


}
//    Использование Math.random
//    Объявить минимальное значение диапазона
//    Объявить максимальное значение диапазона
//    Используйте формулу Math.random()*(max-min+1)+min для создания
//    значений, включающих значение min и max


package org.example._20240523.random;

//Использование Random класса:
//Импортировать класс java.util.Random
//Создать экземпляр класса Random (Random rand = new Random())
//Вызовите один из следующих методов объекта rand:
//nextInt(upperbound) генерирует случайные числа в диапазоне от 0 до upper bound -1.
//nextFloat() генерирует число с плавающей запятой от 0,0 до 1,0.
//nextDouble() генерирует двойное число между 0.0 и 1.0.

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();
//        System.out.println(random.nextInt());
//        System.out.println(random.nextInt(11));
        System.out.println(random.nextFloat());
        System.out.println(random.nextDouble());
    }
}
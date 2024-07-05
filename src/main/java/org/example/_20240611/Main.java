package org.example._20240611;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//    Создайте StringBuilder объекты используя все предоставленные конструкторы
//Используя метод append добавьте к объекту, который создан при помощи конструктора без параметров, строку “StartaUniversity”
//Распечатайте все объекты на консоле
//Примените метод reverse() к любому созданному объекту
//Распечатайте объект на консоле
//    StringBuilder stringBuilder = new StringBuilder("Hello");
//        stringBuilder.append("Ivan & Ilya");
//        System.out.println(stringBuilder);
//
//        StringBuilder stringBuilder1 = new StringBuilder();
//        stringBuilder1.append("in Berlin");
//        System.out.println(stringBuilder1);
//
//        StringBuilder stringBuilder2 = new StringBuilder();
//        stringBuilder2 = stringBuilder;
//
//        System.out.println(stringBuilder2);
//        Создайте объект StringBuilder
//Добавьте в объект строки
//Hello
//“ “ (пробел)
//world!
//Распечатайте результат
//Вставьте строку “beautiful “ между слов Hello и world
//Распечатайте результат
//Распечатайте полную емкость (capacity) объекта
//Распечатайте размер объекта
//Проанализируйте результат
//Создайте массив char размера StringBuilder
//Сохраните объект StringBuilder  в массив, используйте метод getChars()
//Распечатайте результат
        StringBuilder newStringBuilder = new StringBuilder();
        newStringBuilder.append("Hello");
        newStringBuilder.append(" ");
        newStringBuilder.append("world!");
        System.out.println(newStringBuilder);
        newStringBuilder.insert(6, "beautiful ");
        System.out.println(newStringBuilder);
        int capacity = newStringBuilder.capacity();
        System.out.println(capacity);
        int length = newStringBuilder.length();
        System.out.println(length);
        char[] newchar = new char[newStringBuilder.length()];
        newStringBuilder.getChars(0, newStringBuilder.length(), newchar, 0);
        System.out.println(Arrays.toString(newchar));
//Создайте объект StringBuffer используя конструктор String
//"It is String Builder Object"
//Распечатайте объект
//Замените слово Builder на слово Buffer
//Используйте метод replace()
//Распечатайте результат
        StringBuffer newStringBuffer = new StringBuffer("It is String Builder Object");
        System.out.println(newStringBuffer);
        newStringBuffer.replace(13, 20, "Buffer");
        System.out.println(newStringBuffer);
        System.out.println(concatReversStr("Hello", " world"));
    }

//        Напишите метод, который принимает две строки в аргументах, соединяет их и определяет реверсивный порядок, выведите результат на консоль.
//concatReversStr(String str1, String str2)
public static StringBuilder concatReversStr (String str1, String str2){
    String str3 = str1 + str2;
    StringBuilder sB = new StringBuilder(str3);
    sB.reverse();
    return sB;
}

//Дан массив символов, объедините его и замените символ '?' на правильный символ, выведите результат на консоль.
//char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};

    }



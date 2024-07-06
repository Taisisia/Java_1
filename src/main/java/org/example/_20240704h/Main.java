package org.example._20240704h;

public class Main {
    public static void main(String[] args) {

        // Создайте строку через new - I study Basic Java!
        String string = new String("I study Basic Java!");

        // Распечатать пред-последний символ строки. Используем метод String.charAt().
        System.out.println("Пред-последний символ строки: " +string +": "+ string.charAt(string.length() - 2));

        // Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println("Строка содержит подстроку “Java”: "+string.contains("Java"));

        // Вырезать строку Java c помощью метода String.substring().
        System.out.println("Вырезать строку Java из " + string +":" + string.substring(13, 18));

        // Заменить все символы “а” на “о”. c помощью метода String.replace()
        System.out.println("Заменить все символы “а” на “о”: " + string.replace("a", "o"));

        // Преобразуйте строку к верхнему регистру.
        System.out.println("Преобразуйте строку к верхнему регистру: " + string.toUpperCase());

        // Преобразуйте строку к нижнему регистру.
        System.out.println("Преобразуйте строку к нижнему регистру: "+ string.toLowerCase());

    }
}

package Java.src.main.java.org.example._20240515;
//Создать класс Test.
//Создать метод main.
//Создать все переменные примитивных и не примитивных типов.
//Присвоить значения переменным.
//Распечатать результат в консоль
class Test {
    public static void main(String[] args) {
        byte byteValue = 100;
        short shortValue = 250;
        int intValue = 1234567;
        long longValue = 1000_000_000L;
        float floatValue = 123.123f;
        double doubleValue = 123.123;
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        //Дано: два целочисленных числа: 168 и 1500.
//Примените все математические операторы, результат операций вывести в консоль.
//Проанализировать результат.
        int a = 168;
        int b = 1500;

        int resaltPlus = a + b;
        System.out.println(resaltPlus);

        int resaltMinus = a-b;
        System.out.println(resaltMinus);

        int resaltDelenie = a/b;
        System.out.println(resaltDelenie);

        int resaltUmnogenie = a*b;
        System.out.println(resaltUmnogenie);

        int resaltOstatok = a%b;
        System.out.println(resaltOstatok);

        //Дано трехзначное число. Вывести на экран все цифры этого числа
        //Пример: 345
        //Вывод в консоль: Число 345 -> 3, 4, 5


    }
}



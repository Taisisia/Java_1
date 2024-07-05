package org.example._20240613;

import java.util.Random;
import java.util.Scanner;

public class Lotoreia {
    public static void main(String[] args) {
//        Реализовать простую лотерею, используя конструкцию if-else-if:
//Создать класс для лотереи
//В методе main() реализовать лотерею
//Добавить переменные для выигрышных номеров (5 номеров)
//Добавить переменные для номеров пользователя
//Получить от пользователя 5 номеров, используем Сканер
//Ограничить игровые номера от 1 до 50
//Рандомально присвоить в переменные выигрышные номера
//Распечатать на консоль номера лотереи и номера введенные пользователем
//        version 0.1
        //        version 0.2
//        version 0.2
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int humanNum1 = 0;
        int humanNum2 = 0;
        int humanNum3 = 0;
        int humanNum4 = 0;
        int humanNum5 = 0;

        //Выигрышные номера

        int victory1 = random.nextInt(1, 51);
        int victory2 = random.nextInt(1, 51);
        int victory3 = random.nextInt(1, 51);
        int victory4 = random.nextInt(1, 51);
        int victory5 = random.nextInt(1, 51);

        //Ввод от пользователя
        int i = 1;
        int iMax = 5;

        System.out.println("Введите 5 чисел от 1 до 50");

        while (i <= iMax) {

            System.out.print("Введите число #" + i + ": ");
            int humanNumPre = scanner.nextInt();
            if (humanNumPre >= 1 && humanNumPre <= 50) {
                switch (i) {
                    case 1:
                        humanNum1 = humanNumPre;
                        i++;
                        break;
                    case 2:
                        if (humanNumPre != humanNum1) {
                            humanNum2 = humanNumPre;
                            i++;
                        }
                        else {
                            System.out.println("Такое число уже было введено");
                        }

                        break;
                    case 3:
                        if (humanNumPre != humanNum1 && humanNumPre != humanNum2) {
                            humanNum3 = humanNumPre;
                            i++;
                        }
                        else {
                            System.out.println("Такое число уже было введено");
                        }
                        break;
                    case 4:
                        if (humanNumPre != humanNum1 && humanNumPre != humanNum2 && humanNumPre != humanNum3) {
                            humanNum4 = humanNumPre;
                            i++;
                        }
                        else {
                            System.out.println("Такое число уже было введено");
                        }
                        break;
                    case 5:
                        if (humanNumPre != humanNum1 && humanNumPre != humanNum2 && humanNumPre != humanNum3 && humanNumPre != humanNum4) {
                            humanNum5 = humanNumPre;
                            i++;
                        }
                        else {
                            System.out.println("Такое число уже было введено");
                        }
                        break;
                }
            } else {
                System.out.println("Число вне диапазона 1-50");
            }
        }
        System.out.println("Выигрышные номера: " + victory1 + ", " + victory2 + ", " + victory3 + ", " + victory4 + ", " + victory5);
        System.out.println("Вы ввели номера: " + humanNum1 + ", " + humanNum2 + ", " + humanNum3 + ", " + humanNum4 + ", " + humanNum5);
    }
}
//Изменить написанный код
//    Распределите ответственность написанного кода в соответствующие классы и методы
//    Сохраните номера лотереи в массиве 
//    Введите контроль за количеством номеров в лотереи и от пользователя
//    Создайте класс Константы, определите COUNT_SET_SIZE = 5 
//    Добавьте проверку пользовательских номеров с номерами лотереи
//    Реализуйте метод в классе Utils
//    Метод должен принимать два массива (lotteryNumber, userNumber)
//    Возвращать количество совпадений
//    Получите от пользователя 5 номеров, сохраните их в массив
//    Протестируйте работу лотереи в классе StartLottery
//    Выведите результаты на консоль
package org.example._20240528h;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Есть устройство, на табло которого показывается количество секунд, оставшихся до конца рабочего дня.
// Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
// когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
//Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
//Требуется написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том, сколько полных часов осталось до конца рабочего дня.
//Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
//Объяснение: в переменную n должно записываться случайное (на время тестирования программы) целое число из диапазона от 0 до 28800,
// далее оно должно выводиться на экран (для тех, кто понимает в секундах) и на следующей строке (для тех кто не понимает)
// должна выводиться фраза о количестве полных часов, содержащихся в n секундах.
        int secondsInHour = 3600;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение от 0 до 28800: ");

        int seconds = sc.nextInt();

        int hour = seconds / secondsInHour;

        if ( hour >= 5 && hour <= 8) {
            System.out.println("Осталось " + seconds + " секунд");
            System.out.println("Осталось " + hour +  " часов");

        } else if ( hour >= 2 && hour <= 7) {
            System.out.println("Осталось " + seconds + " секунд");
            System.out.println("Осталось " + hour +  " часа");
        }
        else if ( hour == 1) {
            System.out.println("Осталось " + seconds + " секунд");
            System.out.println("Осталось " + hour + " час");
        }
        else if ( hour <1)
        {
            System.out.println("Осталось " + seconds + " секунд");
            System.out.println("Осталось менее часа");
        }


}
    }


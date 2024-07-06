package org.example._20240516;

public class Practik {
    public static void main(String[] args) {
//     Вывести на экран в одну строку все нечётные числа от 0 до 100
        for ( int i = 0; i <= 100; i++) {
            if ( i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
//        В диапазоне от 0 до 100  вывести на экран первые 25 чётных чисел, исключая “десятки”.
        int count = 0;
        for ( int i = 0; i < 100; i += 2) {
            if ( i % 10 !=0) {
                System.out.println(i);
                count++;
                if (count == 25) {
                    break;
                }
            }
//Создать программу которая принимает на вход 3 вещественных числа,
// и будет выводить на экран ТО число, чей остаток от деления на 1.5 -
// меньше остальных. Для наглядности выводить и сам остаток.
            double a = 3.5;
            double b = 3.1;
            double c = 5.7;
            double reminderA = a % 1.5;
            double reminderB = b % 1.5;
            double reminderC = c % 1.5;
            if(reminderA < reminderB && reminderA < reminderC){
                System.out.println(a);
                System.out.println(reminderA);
            } else if (reminderB < reminderA && reminderB < reminderC) {
                System.out.println(b);
                System.out.println(reminderB);
            } else {
                System.out.println(c);
                System.out.println(reminderC);
            }
            }
        }
    }
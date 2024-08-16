package org.example._20240801;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
//Вы реализуете игру, в которой вы показываете пользователю некоторые параметры,
//нажмите 1, чтобы сделать это...,
//нажмите 2, чтобы сделать это... и т. д.,
//и нажмите "Q", чтобы выйти из игры.
//Реализуйте меню выбора игрока (Elf or Orc and Exit)
//Отобразите меню
//1. Elf
//2. Orc
//3. Exit
//Проверьте ввод на соответствие, в случае неверного ввода распечатайте "Choose any one : " и покажите меню выбора
//Сохраните выбор
//Распечатайте выбор в консоль
        Scanner scan = new Scanner (System. in);
        char choose;
        do {
            System.out.println("Choose a hero");
            System.out.println("1 - Elf");
            System.out.println("2 - Orc");
            System.out.println("3 - Exit");
            choose = scan.next().charAt(0);
        } while(choose != 'Q' && choose !='1' && choose != '2' && choose != '3');
//
        switch (choose){
            case '1':
                System.out.println("Elf");
                break;
            case '2':
                System.out.println("Orc");
                break;
            case '3':
            case 'Q':
                System.out.println("See you");
                break;
            default:
                System.out.println("unknown char");

        }
    }
}

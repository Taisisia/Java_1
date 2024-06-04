package org.example._20240604;

import javax.swing.*;
import java.util.Scanner;

public class PraktikaIgra {
    public static void main(String[] args) {
//        Вы реализуете игру, в которой вы показываете пользователю некоторые параметры,
//        нажмите 1, чтобы сделать это...,
//        нажмите 2, чтобы сделать это... и т. д.,
//        и нажмите "Q", чтобы выйти из игры.
//                Реализуйте меню выбора игрока (Elf or Orc and Exit)
//        Отобразите меню
//        1. Elf
//        2. Orc
//        3. Exit
//        Проверьте ввод на соответствие, в случае неверного ввода распечатайте "Choose any one : " и покажите меню выбора
//        Сохраните выбор
//        Распечатайте выбор в консоль
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Select a game race");
            System.out.println("1. Elf");
            System.out.println("2. Orc");
            System.out.println("3. Exit");
            System.out.println("Make your choice");
            choice = sc.next().charAt(0);
        }
        while (choice != '1' && choice != '2' && choice != '3');
        if(choice=='1'){
            System.out.println("You are Els");
        } else if (choice =='2') {
        System.out.println("You are Orc");
        } else  {
            System.out.println("Good bye");
        }
    }
}

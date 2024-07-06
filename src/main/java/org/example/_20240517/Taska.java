package org.example._20240517;

import java.util.Scanner;
public class Taska {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите X");
        int x = sc.nextInt();
        System.out.println("Введите Y");
        int y = sc.nextInt();

        if (x < 1 || x > 3 || y < 1 || y > 3) {
            System.out.println("Error");
        } else if (x == 2 || x == 3) {
            System.out.println(x);
        } else if (x == 1) {
            System.out.println(y);
        }
        System.out.println("Привет, Иван!");
    }
}




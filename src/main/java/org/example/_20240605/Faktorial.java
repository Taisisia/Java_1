package org.example._20240605;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
//        1! =  1
//2! =  1 * 2 = 2
//3! =  1 * 2 * 3 = 6
//4! =  1 * 2 * 3 * 4 = 24
//5! =  1 * 2 * 3 * 4 * 5  = 120
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        int resalt = 1;
        for (int i=1; i<=num; i++) {
            resalt = i * resalt;
        }
        System.out.println( "Результат " + resalt);
    }
}


package org.example._20240603;

import java.util.Scanner;

public class PraktikaPrjamougolnik {
    public static void main(String[] args) {
//  Показать на экране прямоугольник размером MxN, состоящий из
//// звёздочек. Затем сделать то же самое, но чтоб фигура внутри была
//// пустая (остаётся только рамка).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter m");
        int m = scanner.nextInt();
        System.out.println("Enter n");
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j <= n - 1 || i == m - 1 && j <= n - 1 || j == 0 && i <= m - 1 || j == n - 1 && i <= m - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
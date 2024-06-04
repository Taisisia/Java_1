package org.example._20240604;

import java.util.Scanner;

public class PraktikaFibanachi {
    public static void main(String[] args) {
//        числа Фибоначчи - это 1  1  2  3  5  8  13  21  34  55  89  и т.д.
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите количество чисел Фибаначи");
        int kol= scanner.nextInt();
        int num1=1;
        int num2=1;
        int num3;
        System.out.print(num1+" "+num2+" ");
        for (int i=3; i<=kol; i++) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            if (i % 15 == 0) {
                System.out.println();
            }
            num1= num2;
            num2= num3;

        }
    }
}

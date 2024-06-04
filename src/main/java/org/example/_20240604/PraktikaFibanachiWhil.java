package org.example._20240604;

import java.util.Scanner;

public class PraktikaFibanachiWhil {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите количество чисел Фибаначи");
        int kol= scanner.nextInt();
        int num1=1;
        int num2=1;
        int num3;
        System.out.print(num1+" "+num2+" ");
        int i = 3;
        while(i<=kol) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1= num2;
            num2= num3;
            i++;
        }
    }
}

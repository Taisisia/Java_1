package org.example._20240604;

import java.util.Scanner;

public class Primer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//
//    int j = 0;
//while (j < 3 )
//
//    {
//        System.out.println(j);
//        j++;
//    }



//        infinity loop
        while (true) {
            System.out.println("Hello");
            while(true) {
                System.out.println("Enter first number");
                int a = sc.nextInt();
                System.out.println("Enter second number");
                int b = sc.nextInt();
                System.out.println("Enter operation");
                char oper = sc.next().charAt(0);
                System.out.println(a + " " + oper + " " + b + " = " + (a + b));
                System.out.println("Do you you want one more time?(Y/N)");
                char answer = sc.next().charAt(0);
                if (answer == 'N' || answer == 'n') {
                    break;
                }
            }
        }
    }
}

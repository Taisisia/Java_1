package org.example._20240605;

import java.util.Scanner;

public class PoliandromVOdin {
    public static void main(String[] args) {
//        // Определить, является ли введённое число любой разрядности палиндромом
//// (например, 1234321 – палиндром, 12345 – не палиндром).
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите число");
        String number= scanner.next();
        boolean flag= false ;
        for (int i =0; i<= number.length()/2; i++){
            if ( number.charAt(i)==number.charAt(number.length()-i-1)) {
                flag=true;
            }
            else flag=false;
        }
        String res = flag ? "number ist polindrom" : "number ist not polindrom";
        System.out.println(res);
            }

        }


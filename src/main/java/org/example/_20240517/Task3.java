package org.example._20240517;

import java.math.BigInteger;

public class Task3 {
    public static void main(String[] args) {
//        Задача о зёрнах на шахматной доске
//Нужно вычеслить: cколько будет зёрен на шахматной доске, если класть на каждую следующую клетку доски вдвое больше зёрен, чем на предыдущую, начиная с одного. (Для не-шахматистов: кол-во клеток на шахматной доске - 64)
//(использование интернета – 3 балла)

        BigInteger sum = BigInteger.valueOf(0);
        BigInteger two = BigInteger.valueOf(2);

        for (int i=0; i < 64; i++) {
           sum = sum.add(two.pow(i));

            System.out.println(sum);
        }
//        public class MathExample {
//    public static void main(String[] args) {
//        int a = 3;
//        int b = (int) Math.pow(a, 3);
//        System.out.println(b);
//
//        double c = Math.sqrt(2);
//        System.out.println(c);
//
//        BigInteger d = BigInteger.valueOf(15);
//        BigInteger e = BigInteger.valueOf(5);
//
//        BigInteger f = d.add(e);
//        BigInteger j = d.subtract(e);
//        BigInteger h = d.multiply(e);
//        BigInteger k = d.divide(e);
//        System.out.println(f);
//        System.out.println(j);
//        System.out.println(h);
//        System.out.println(k);
//    }
                int n = 5;
                int sum1 = 1;
                for (int i = 0; i < n; i++) {
                    if (i == 0) {
                        System.out.println(sum);
                    } else {
                        sum1 = sum1 * 10;
                        System.out.println(sum1 + 1);
                    }
                }
                for (int i = n - 1; i > 1; i--) {
                    sum1 = sum1 / 10;
                    System.out.println(sum1 + 1);
                }
                System.out.println(1);
            }
        }




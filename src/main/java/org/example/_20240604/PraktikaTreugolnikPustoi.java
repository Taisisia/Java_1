package org.example._20240604;

public class PraktikaTreugolnikPustoi {
    public static void main(String[] args) {
        int height = 7; //sc.nextInt();
        int a = 0;
        int b = height - 1;
        int c = height + 1;
        a = 0;
        b = height;
        c = height;
// каркас треугольник
        for (int j = 0; j <= height; j++) {
            for (int i = 0; i <= height * 2; i++) {
                if (j == a && i == b || j == a && i == c || j == height && i <= height * 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            a++;
            b--;
            c++;
            System.out.print("\n");
        }
    }
}

package org.example._20240808;

import java.util.Random;

public class Povtorenie {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int[][] array = new int[n][m];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = rand.nextInt(51);
            }
        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(Arrays.toString(array[i]));
//        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

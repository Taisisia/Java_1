package org.example._20240801;

public class For {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 2; i < 10; i++) {

            for (int j =2; j < 10; j++){
                System.out.print(i + " * " + j + " = " + (i*j) + "\t");
            }
            System.out.println();

        }

    }
}

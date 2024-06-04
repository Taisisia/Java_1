package org.example._20240604;

public class PraktikaTreugolnikZapolnenu {
    public static void main(String[] args) {
        // Показать на экране равнобедренный треугольник (пользователь вводит
// высоту). Затем сделать то же самое, но чтоб фигура внутри была пустая
// (остаётся только контур).
        //        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a value: ");
        int height = 7; //sc.nextInt();
        int a = 0;
        int b = height - 1;
        int c = height + 1;

        for (int j = 0; j < height; j++) {
            for (int i = 0; i < 2 * height; i++) {
                if (j == a && i > b && i < c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            a++;
            b--;
            c++;
            System.out.println();
        }
    }
}

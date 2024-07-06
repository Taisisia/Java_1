package org.example._20240517;

public class Task2 {
    public static void main(String[] args) {
//        Вывести на экран “равнобедренный треугольник”, все “рёбра” которого состоят из единиц, “медиана” равна целому числу n, а вся “площадь” заполнена нулями =)
//пример: n = 5
//1
//11
//101
//1001
//10001
//1001
//101
//11
//1
        int n = 5;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println(1);
            } else {
                System.out.print(1);
                for (int k = 0; k < i - 1; k++) {
                    System.out.print(0);
                }
                System.out.println(1);
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (i == 0) {
                System.out.println(1);
            } else {
                System.out.print(1);
                for (int k = 0; k < i - 1; k++) {
                    System.out.print(0);
                }
                System.out.println(1);
            }
        }
    }
}


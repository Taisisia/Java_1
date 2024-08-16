package org.example._20240801;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println(i);

        int j = 10;
        while (j > 0) {
            System.out.println(j);
            j--;
        }
        System.out.println(j);
        int k = 2;
        while (true) {
            if (k < 5) {
                System.out.println("JAVA " + k);
                k++;
            } else {
                break;
            }
        }
        for (int idx = 0; idx < 10; idx++) {
            System.out.println("JAVA");
        }

//        Инициализируйте переменную int count = 10;
//Создать метод, который печатает в консоле “Привет программист” count раз 
//Используйте цикл while
        int count = 10;
        //        while (true) {
//            if (count < 10){
//                System.out.println("Hello developer");
//                count++;
//            } else {
//                break;
//            }
//        }
        while (count>0) {
                System.out.println("Привет программист " + count);
                count--;

            }

        }
    }


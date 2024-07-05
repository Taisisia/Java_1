package org.example._20240607;

public class Main {
    public static void main(String[] args) {
//        while если не знаем сколько итераций цикла будет.
//        Цикл зависит от условия: пока выполняется условие
        int i = 0;
        while ( i < 10) {
            System.out.println("while cycle: + i");
            i++;
        }
//        for если знаем сколько итераций цикла будет
        for (int k =0; k < 10; k++) {
            System.out.println( " for cycle: " + k);
        }
//
//       do weil цикл с пост условием
        int j = 0;
        do {
            System.out.println("do while: " + j);
            j++;
        }
while (j <10);
//break
        while (true) {
            System.out.println("endless while: " + i);
            i++;
            if (i== 1000000) {
                break;
            }
//            continue
            while (i<= 150000) {
                i++;
                if (i%2==0) {
                    continue;}
                System.out.println(i);
            }
        }
    }
}

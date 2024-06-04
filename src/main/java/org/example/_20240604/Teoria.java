package org.example._20240604;

public class Teoria {
    public static void main(String[] args) {
        //        regular loop
//        for (int i = 10; i > 5; i--) {
//            System.out.println(i);
//        }

//        break loop
//        for (int i = 0; i < 1000; i++) {
//            if (i == 10) {
//                break;
//            }
//            System.out.println(i);
//        }

//        return from function loop
        System.out.println(getNum());
    }
    public static int getNum() {
        int sum = 0;
        for(int i = 0; i < 1000; i++) {
            if (i == 5) {
                return sum;
            }
            sum += i;
        }
        return 0;
    }
    public static String getName() {
        for (int i = 0; i < 100000; i++) {
            if (i == 5) {
                return "End if";
            }
        }
        return null;
    }
   }



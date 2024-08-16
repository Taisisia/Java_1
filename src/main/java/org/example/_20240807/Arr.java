package org.example._20240807;

public class Arr {
    public static void main(String[] args) {
        //  regular регулярный способ
        int [] array = new int[10];
        for (int item : array){
            System.out.println(item);
        }


        // literal литеральный способ
        int []arrInt = {1, 2, 3, 4, 5};

//        for (int item : array) {
//            System.out.println(item);
//        }
//        System.out.println(array.length);
//        for (int item : arrInt) {
//            System.out.print(item + " ");
//        }
            for (int i = 0; i < arrInt.length; i++) {
                System.out.print(arrInt[i] + " ");
            }
            System.out.println();
//        System.out.println(arrInt[arrInt.length - 1]);
            System.out.println("Array length - " + arrInt.length);
            System.out.println("arrInt[" + (arrInt.length - 1) + "] = " + arrInt[arrInt.length - 1]);
        }
    }


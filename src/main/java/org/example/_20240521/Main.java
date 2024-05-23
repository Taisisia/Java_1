package org.example._20240521;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

int [] arr = {1,2, 3, 4};
int [] arr2 =arr;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        arr[0] = 10;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        String str = "Java";
//        String strNew = "Java";
//        System.out.println(str.hashCode() + " " + strNew.hashCode());
//        String str1 = new String("Java");
//        System.out.println(str1.hashCode());
//        System.out.println(str == str1);
//        System.out.println(str == strNew);
//        String str = new String("Hello");
        System.out.println(str.hashCode());
        String str2 = str;
        System.out.println(str + " " + str2);
        str += "!!!";
        System.out.println(str + " " + str2);
        System.out.println(str.hashCode());
        //        str += "!!!";
//        System.out.println(str.hashCode());
//        StringBuilder sb = new StringBuilder("Hello");
//        System.out.println(sb.hashCode());
//        sb.append("!!!");
//        System.out.println(sb.hashCode());

//        int a = 10;
//        int b = a;
//        System.out.println(a + " " + b);
//        a = 12;
//        System.out.println(a + " " + b);

//        int[] arr = {1, 2, 3, 4};
//        int[] arr2 = arr;
//        System.out.println(arr.hashCode());
//        System.out.println(arr2.hashCode());
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));
//        arr[0] = 10;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));
    }
}

package org.example._20240605;

public class PoliandromVTri {
    public static boolean isPalindrome(int num) {
        int r,sum=0,temp;

        temp=num;
        while(num > 0){
            r=num%10;  //getting remainder
            sum=(sum*10)+r;
            num=num/10;
        }
        return temp==sum;
    }
}

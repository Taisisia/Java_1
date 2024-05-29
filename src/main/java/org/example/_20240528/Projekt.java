package org.example._20240528;

public class Projekt {

    public static void main(String[] args) {

//        Создайте переменные int a, b, c, d;
//        Используя блок if (выражение) {}, составьте логические выражения
//        истина , если “а” меньше “b” И “b” равно “c”;
//        истина , если “а” больше “b” ИЛИ “c” равно “d”;
//        истина , если “а” НЕ равно “b”;
    int a = 7;
    int b = 105;
    int c = 314;
    int d =54;
        System.out.println(isTrueFalse(a, b, c, d));

}
public static boolean isTrueFalse (int a, int b, int c, int d ) {

    if (a<b && b==c) {
        return true;
    }
    if (a>b || c==d) {
        return true;
    }
    if ( a!=b){
        return true;
    }
    return false;
}
    public static boolean getResult() {
        int startFirst = 0;
        int endFirst = 10;
        int startSecond = 5;
        int endSecond = 15;
        int value = 7;
        return  (value >= startFirst && value <= endFirst) ||
                (value >= startSecond && value <= endSecond);

    }
}


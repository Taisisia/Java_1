package org.example._20240530;

public class SwitchWochenende {
//    public static void main(String[] args) {
//Создайте switch-блок, который мог бы определить, является ли переданный день выходным или рабочим днем.
//Создайте переменные int day; String dayString;
//Используйте объединение для несколько случаев без операторов break
//Реализуйте тот же процесс используя if-else блоки
//Реализуйте тот же процесс используя тернарное выражение
//Сравните решения
//        int day = 5;
//        String dayString = null;
//
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                dayString = "Working Day";
//                break;
//            case 6:
//            case 7:
//                dayString = "Weekend day";
//                break;
//            default:
//                dayString = "Invalid day";
//        }
//        System.out.println(dayString);
//    }

    public static void main(String[] args) {
        int weekDay = 7;
        if (weekDay >0 && weekDay < 6) {
            System.out.println("Working Day");
    } else if  (weekDay > 5 && weekDay < 8 ) {
            System.out.println("Weekend day");
        }
        else {
            System.out.println("Invalid day");
        }

    }
}

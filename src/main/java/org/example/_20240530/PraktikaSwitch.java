package org.example._20240530;

public class PraktikaSwitch {
    public static void main(String[] args) {
//        Создайте switch-блок с днями недели
//Создайте переменные int day; String dayString;
//В каждом кейсе инициализируйте переменную dayString правильным значением.
//Запустите программу, передав в switch-условие день 2.

        int day = 7;
        String dayString = null;
        switch (day){
            case 1: dayString = "Monday";
                break;
            case 2: dayString = "Tuesday";
                break;
            case 3: dayString = "Wednesday";
                break;
            case 4: dayString = "Thursday";
                break;
            case 5: dayString = "Friday";
                break;
            case 6: dayString = "Saturday";
                break;
            case 7: dayString = "Sunday";
            break;
            default:dayString = "Invalid day";
        }
        System.out.println(dayString);
    }
}

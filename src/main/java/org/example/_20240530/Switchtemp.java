package org.example._20240530;

public class Switchtemp {
    public static void main(String[] args) {
//        переменная int temperature, которая представляет собой температуру воздуха в градусах Цельсия.
//Мы хотим вывести сообщение в зависимости от значения температуры:
//Если температура равна 0, вывести сообщение "This is the freezing point."
//Если температура равна 20, вывести сообщение "This is room temperature."
//Если температура равна 100, вывести сообщение "This is the boiling point."
//В противном случае вывести сообщение "Temperature is not a special quantity."
        int temperature = 15;

        String temperatureString = null;
        switch (temperature){
            case 0: temperatureString = "This is the freezing point";
                break;
            case 20: temperatureString = "This is room temperature.";
                break;
            case 100: temperatureString = "This is the boiling point";
                break;

            default:temperatureString = "Temperature is not a special quantity.";
        }
        System.out.println(temperatureString);
    }
}



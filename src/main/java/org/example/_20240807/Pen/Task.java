package org.example._20240807.Pen;

public class Task {
    public static void main(String[] args) {

        Pen pen1 = new Pen ();
        Pen pen2 = new Pen ();
        Pen pen3 = new Pen ();
        pen1.setColor("Genre");//
        pen2.setColor("Red");//
        pen3.setColor("Black");//
        // Создайте массив L = 3
        Pen [] arrPens = new Pen [ ] { pen1, pen2, pen3 };

        //Достаньте поочередно из массива ручки и измените цвет каждой на
        for (int i=0; i< arrPens.length; i++) {
            System.out.println(arrPens[i].getColor());
        }
        pen1.setColor("Black");
        pen2.setColor("Genre");
        pen3.setColor("Red");
        for (int i=0; i< arrPens.length; i++) {
            System.out.println(arrPens[i].getColor());
        }
    }
//        Создайте класс ручка (Pen)
//        a. Определите свойство color типа String с доступом private
//        b. Создайте методы getColor(); setColor(String newColor);
//        2. Создайте класс Test
//        3. Создайте три объекта типа Pen
//        4. Создайте массив L = 3
//        5. Сохраните все объекты в массив
//        6. Достаньте поочередно из массива ручки и измените цвет каждой на
//        a. “Green”
//        b. “Red”
//        c. “Black”
//        7. Инициализируйте массив числами от 1 до 10 используя способ литерала
//        8. Выведите на консоль элемент из второй ячейки
//        9. Распечатайте на консоль все элементы из ячеек массива
//        10. Проанализируйте выход в консоле
//        11. Распечатайте цвета ручек из массива


    }


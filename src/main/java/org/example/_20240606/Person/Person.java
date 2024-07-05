package org.example._20240606.Person;

public class Person {
//    Создайте класс Person
//Определите свойство класса name с модификатором private
//Определите конструктор с параметром name
//Переопределите toString(), таким образом, чтобы выводилось “Name is …”
//Переопределите hashCode(), таким образом, чтобы hashCode всегда был равен 10
//Переопределите equals(), таким образом, чтобы сравнение было только с входящим объектом

        private String name;
        public Person(String name){
            this.name=name;
        }

        @Override
        public String toString() {
            return " Name is  " + name;
        }

        @Override
        public int hashCode() {
            return 10;
        }

        @Override
        public boolean equals(Object obj) {
            return this==obj;
////            Person ivan = new Person("Ivan");
//            Person petr = new Person("Peter");
//            Object vasay = new Object();
//            String str = new String();
//
//            System.out.println(ivan.equals(petr));
//            System.out.println(ivan.equals(vasay));
//            System.out.println(ivan.equals(str));
        }
    }



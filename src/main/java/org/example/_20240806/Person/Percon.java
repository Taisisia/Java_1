package org.example._20240806.Person;

import org.example._20240606.Person.Person;

import java.util.Objects;

public class Percon {
//    Создайте класс Person
//    Определите свойство класса name с модификатором private
//    Определите конструктор с параметром name
//    Переопределите toString(), таким образом, чтобы выводилось “Name is …”
//    Переопределите hashCode(), таким образом, чтобы hashCode всегда был равен 10
//    Переопределите equals(), таким образом, чтобы сравнение было только с входящим объектом
    private String name;// Определите свойство класса name с модификатором private

    public Percon(String name) { // Определите конструктор с параметром name
        this.name = name;
    }

    @Override
    public String toString() { // Переопределите toString(), таким образом,
                                // чтобы выводилось “Name is …”
        return "Name is " + name;
    }

    @Override
    public boolean equals(Object o) { // Переопределите equals(),
        // таким образом, чтобы сравнение
        // было только с входящим объектом

        return this == o;
    }

    @Override
    public int hashCode() { // Переопределите hashCode(), таким образом,
        // чтобы hashCode всегда был равен 10
        return Objects.hash(10);
    }
}

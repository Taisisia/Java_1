package org.example._20240806.Person;

import org.example._20240606.Person.Person;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Person bob = new Person("Bob");
        Person ivan = new Person("Ivan");
        System.out.println(bob);
        System.out.println(ivan);
        System.out.println(bob.equals(ivan));
        Object obj = new Object();

        System.out.println(bob.equals(obj));

        System.out.println(bob.hashCode());

    }
}

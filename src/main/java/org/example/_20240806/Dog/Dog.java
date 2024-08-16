package org.example._20240806.Dog;

import java.util.Objects;

public class Dog {
    private String name;
    private int age;
    private String color;


    public Dog(String name, int age, String color) { // Создаем конструктор для Dog
        this.name = name;
        this.age = age;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name) && Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }
}
//
//    public String getName () {
//        return name;
//    }
//    public int getAge(){
//        return age;
//    }
//    public String getColor() {
//        return color;
//    }
//    public void run () {
//        System.out.println(this.name+ "is running...");
//        // return "The dog is running...";
//    }
//    public void eat (){
//        System.out.println(this.name + "is eating...");
//    }
//    public void sleep () {
//        System.out.println(this.name +  " is sleeping...");
//    }
//}

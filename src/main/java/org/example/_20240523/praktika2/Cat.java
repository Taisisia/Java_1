package org.example._20240523.praktika2;

public class Cat {
    private String name;
    private int age;
    private String color;

    public Cat (String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName (){
        return this.name;
    }
    public int getAge (){
        return this.age;
    }
    public String getColor (){
        return this.color;
    }
}

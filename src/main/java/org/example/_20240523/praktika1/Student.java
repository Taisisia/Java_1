package org.example._20240523.praktika1;

public class Student  {
    private String name;
    private int age;
    private String education;

    public Student (String name, int age, String education) {
        this.age = age;
        this.name = name;
        this.education = education;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public String getEducation(){
        return this.education;
    }
}


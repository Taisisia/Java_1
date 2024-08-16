package org.example._20240708;
public class Dog {
    private String name;
    private int age;

    //    default constructor
//    public Dog(){}
    public Dog(String nameDog, int ageDog) throws Exception {
        name = nameDog;
        if (ageDog > 0){
            age = ageDog;
        } else {
            throw new Exception("Dog has incorrect age!");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void run() {
        System.out.println("Dog is running...");
    }
}


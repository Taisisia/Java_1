package org.example._20240708;

public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println("JAVA!");
//        Dog dog = new Dog();
        Dog dog = new Dog("Spike", 10);
        dog.run();
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
//        dog.age = -10;
//        System.out.println(dog.age);
    }
}

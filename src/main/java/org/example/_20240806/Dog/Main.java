package org.example._20240806.Dog;

public class Main {
    public static void main(String[] args) {
        Dog spike = new Dog ("Spike", 8, "black");
        Dog tike = new Dog ("Tike", 3, "white");
//        System.out.println(spike.getName());
//        System.out.println(tike.getName());
//        spike.run();
//        tike.run();
//        tike.eat();
//        spike.eat();
//        spike.sleep();
//        tike.sleep();
        System.out.println(spike);
        System.out.println(tike);
        System.out.println(spike.equals(tike));

    }
}

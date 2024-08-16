package org.example._20240708;

public class Test {
    public static void main(String[] args) {
        Cat name =new Cat();
        System.out.println(name.getName());
        System.out.println(name.getAge());
        Cat name1 = new Cat ("Grey");
        System.out.println(name1.getName());
        System.out.println(name1.getAge());
        Cat age1 = new Cat(8);
        System.out.println(age1.getName());
        System.out.println(age1.getAge());
    }
}

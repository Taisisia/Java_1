package org.example._20240806.annonymousClass;

public class GFC {

    // Method 1
    // show() method inside main class
//    static Hello h = () -> {
//        // Print statement
//        System.out.println("i am in anonymous class");
//    };
    static Hello h = new Hello() {
        @Override
        public void show() {
            System.out.println("i am in anonymous class");
        }
    };
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Calling show() method inside main() method
        h.show();
        Runnable r = () -> System.out.println("Hello from run method");
        r.run();
    }
}


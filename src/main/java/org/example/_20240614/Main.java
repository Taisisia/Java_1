package org.example._20240614;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String expression = scanner.nextLine();
        Calculator calculator=new Calculator();
        System.out.println(calculator.calculateResult(expression));
    }
}

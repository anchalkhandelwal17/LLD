package org.lld.Chess;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // --- Reading Text ---
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine(); // Reads a full line of text

        // --- Reading an Integer ---
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads a whole number

        System.out.println("Hi " + name + " your age is " + age);
    }
}

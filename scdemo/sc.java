package scdemo;

import java.util.Scanner;

public class sc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = input.next();
        System.out.println("welcome:" + name);
        System.out.println("enter age:");
        int age = input.nextInt();

        // voting dynamic//
        if (age >= 18) {
            System.out.println("you can vote");
        } else {
            System.out.println("you cant vote");
            System.out.println("your age is:" + age);

        }
        // with nested conditions //
        System.out.println("enter age:");
        int newage = input.nextInt();

        if (newage >= 18) {
            System.out.println("do you have id yes/no");
            String has_id = input.next();

            if (has_id == "yes") {
                System.out.println("you can vote:");

            } else {
                System.out.println(" you need id:");
            }
        } else {
            System.out.println("you cant vote");
            System.out.println("your age is:" + age);

        }
    }
}

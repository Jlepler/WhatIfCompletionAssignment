import java.util.Scanner;

public class WhatIfCompletionAssignment {
    public static void main(String[] args) {

        int num1, num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        if ((num1 + num2) > 200) {
            if ((num1 + num2) < 1000) {
                System.out.println("The sum of the first and second number is: " + (num1 + num2) + "~");
                System.out.println("The product of the first and second number is: " + num1 * num2);
                System.out.println("The average of the first and second number is " + (num1 + num2) / 2);
            } else {
                System.out.println("The sum of the first and second number is: " + (num1 + num2) + "*");
                System.out.println("The product of the first and second number is: " + (num1 * num2));
                System.out.println("The average of the first and second number is " + (num1 + num2) / 2);
            }
        } else {
            System.out.println("The sum of the first and second number is: " + (num1 + num2));
            System.out.println("The product of the first and second number is: " + (num1 * num2));
            System.out.println("The average of the first and second number is " + (num1 + num2) / 2);

        }
    }
}


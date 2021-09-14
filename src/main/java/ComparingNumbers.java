/*
 *  UCF COP3330 Fall 2021 Exercise 22 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scan.nextInt();

        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("You cannot enter the same numbers");
        }
        else {
            int max = num1;
            if (num2 > max)
                max = num2;
            if (num3 > max)
                max = num3;
            System.out.println(String.format("The largest number is %d.", max));
        }
    }
}
package com.dsa.control.statements;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        // Write a program to find if given number is prime or not.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        boolean isPrime = true;
        for(int i = 2; i<number; i++) {
            if(number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}

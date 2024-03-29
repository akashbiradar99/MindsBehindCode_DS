package com.dsa.control.statements;

import java.util.Scanner;

public class FibonacciSeriesExampleByLoop {

    // fibonacci series by for loop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.println("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}

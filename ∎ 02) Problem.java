 package Javaappp;

import java.util.Scanner;

public class prb5b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        printPattern(scanner.nextInt());
        scanner.close();
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + "*".repeat(i)); 
        }
    }
}
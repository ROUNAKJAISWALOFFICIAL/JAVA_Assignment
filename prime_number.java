/*Create a program that accepts 10 integers from the user, stores them in
an array, and then prints only the prime numbers in that array.
Implement a separate method to check if a number is prime.*/

import java.util.Scanner;

public class prime_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 Integers to check the numbers are prime or not");  

        int[] numbers = new int[10]; 

        // Accepting 10 integers from the user
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Prime numbers in the array are:");
        // Checking and printing only the prime numbers
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


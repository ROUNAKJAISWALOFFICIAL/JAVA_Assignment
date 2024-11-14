/*Write a program that takes an integer input n and stores the first n terms
of the Fibonacci sequence in an array. Then, print the array. For example,
if the user enters 7, store and display the first 7 terms of the Fibonacci
sequence: 0, 1, 1, 2, 3, 5, 8.*/


import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        
        // Check if input is valid
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Array to store the first n terms of Fibonacci sequence
            int[] fibonacci = new int[n];

            // Initialize the first two terms
            if (n > 0) fibonacci[0] = 0;
            if (n > 1) fibonacci[1] = 1;

            // Generate the Fibonacci sequence up to n terms
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

            // Print the array
            System.out.print("The first " + n + " terms of the Fibonacci sequence are: ");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci[i] + " ");
            }
        }
        
        scanner.close();
    }
}

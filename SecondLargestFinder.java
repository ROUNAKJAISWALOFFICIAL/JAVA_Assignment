/*Write a program that accepts n integers from the user (where n is also
provided by the user). Store the numbers in an array and write a method
to find and display the second largest number in the array.*/
import java.util.Scanner;

public class SecondLargestFinder {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of integers
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Check if the array can have at least two elements
        if (n < 2) {
            System.out.println("Please enter at least two elements.");
            return;
        }

        // Input elements into the array
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Call method to find the second largest number
        int secondLargest = findSecondLargest(numbers);
        System.out.println("The second largest number is: " + secondLargest);
        
        scanner.close();
    }

    // Method to find the second largest number in the array
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : array) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        return secondLargest;
    }
}

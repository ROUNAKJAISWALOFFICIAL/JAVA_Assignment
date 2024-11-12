/*Write a Java program that takes an integer input from the user and
calculates the factorial of the number. Then, write a method to calculate
the sum of the digits of this factorial. For example, if the user enters 5,
calculate 5! (120) and then find the sum of its digits (1 + 2 + 0 = 3).*/
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Input from the user
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        int factorial = 1;
        for(int i = 1;i<=num; i++){
            factorial *=i;
        }

        System.out.println("The factorial of the number " + num+ " is " + factorial);

        // Calculate sum of digits
        int sumOfDigits = 0;
        long temp = factorial;
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of the 5digits of the factorial is: " + sumOfDigits);
    }
}

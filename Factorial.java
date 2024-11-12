
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
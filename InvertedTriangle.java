/*Write a program that takes an integer input n and prints an inverted
triangle of numbers. For example, if n = 5, the output should be:
5 4 3 2 1
4 3 2 1 
3 2 1 
2 1
1 
*/
import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}

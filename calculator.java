/*Build a menu-driven calculator that performs addition, subtraction,
multiplication, or division based on the user's choice. Use if-else
statements to determine the operation.
Keep prompting the user to perform another operation until they choose
to exit.*/
import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean continousCalculator = true;

    while (continousCalculator) { 
    System.out.println("== Menu-Driven Calculator ==");
    System.out.println("Choose an operation below");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("5. Exit");
    System.out.print("Enter your choice (1-5): ");

    int choice = sc.nextInt(); // Taking the choice input from the user 
    
    if(choice == 5){
        System.out.println("Thankyou!!");
        continousCalculator = false;  
    }
    else if (choice < 1 ||choice > 5 ){
        System.out.println("Choose the correct option");
        
    }
    else{
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        if(choice == 1){
            System.out.println("Result = " + (num1 + num2));
        }
        else if(choice == 2){
            System.out.println("Result = " + (num1 - num2));
        }
        else if(choice == 3){
            System.out.println("Result = " + (num1 * num2));
        }
        else if(choice == 4){
            // CHeck the division is valid or not
            if (num2 == 0){
                System.out.println("Error: Division by zero is not allowed.");
            }
            else {

                System.out.println("Result = " + (num1 / num2));
            }
        }
    }


    

    }
    sc.close(); // scanner close
}
  } 


package April.HW_25042024;

import java.util.Scanner;

public class HW_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        int input1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int input2 = scanner.nextInt();

        System.out.print("Enter the operation (+, *, /, %, -): ");
        char operation = scanner.next().charAt(0);

        // Declaring result variable outside the switch statement
        int result;

        // Performing arithmetic operation based on user input
        switch (operation) {
            case '+':
                result = input1 + input2;
                break;
            case '-':
                result = input1 - input2;
                break;
            case '*':
                result = input1 * input2;
                break;
            case '/':
                result = input2 != 0 ? input1 / input2 : 0; // Division by zero handled
                break;
            case '%':
                result = input1 % input2;
                break;
            default:
                System.out.println("Invalid operation!");
                return; // Exit the program if operation is invalid
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}

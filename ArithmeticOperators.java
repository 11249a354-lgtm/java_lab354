/*A354
AIM

To write a Java program to perform arithmetic operations such as addition, subtraction, multiplication, division, and modulus on two numbers using a switch statement.

ALGORITHM
1. Start the program.
2. Import the Scanner class to read input from the user.
3. Create a Scanner object.
4. Read two integer numbers x and y.
5. Display the following operation choices:
Addition
Subtraction
Multiplication
Division
Modulus
Exit
6. Read the user's choice.
7. Use a switch statement to perform the selected operation:
Case 1: Calculate x + y.
Case 2: Calculate x - y.
Case 3: Calculate x * y.
Case 4: Calculate x / y after checking that y is not zero.
Case 5: Calculate x % y.
Case 6: Exit the program.
8. Default: Display "Invalid choice".
9. Repeat the process until the user selects Exit.
10. Stop the program. */

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println("\nEnter the two numbers to perform operations");

            System.out.print("Enter the first number: ");
            int x = s.nextInt();

            System.out.print("Enter the second number: ");
            int y = s.nextInt();

            System.out.println("\nChoose the operation you want to perform:");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. MODULUS");
            System.out.println("6. EXIT");

            int choice = s.nextInt();

            switch (choice) {

                case 1:
                    int add = x + y;
                    System.out.println("Result: " + add);
                    break;

                case 2:
                    int sub = x - y;
                    System.out.println("Result: " + sub);
                    break;

                case 3:
                    int mul = x * y;
                    System.out.println("Result: " + mul);
                    break;

                case 4:
                    if (y != 0) {
                        float div = (float) x / y;
                        System.out.println("Result: " + div);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;

                case 5:
                    int mod = x % y;
                    System.out.println("Result: " + mod);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
/*OUTPUT
Sample Output 1 – Addition
Enter the two numbers to perform operations
Enter the first number: 20
Enter the second number: 10

Choose the operation you want to perform:
1. ADDITION
2. SUBTRACTION
3. MULTIPLICATION
4. DIVISION
5. MODULUS
6. EXIT
1
Result: 30*/

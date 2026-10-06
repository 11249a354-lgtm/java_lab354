/*A354
AIM

To write a Java program to check whether a given number is even or odd using a switch statement.

ALGORITHM
1. Start the program.
2. Import the Scanner class.
3. Declare an integer variable n.
4. Read a number from the user.
5. Find the remainder using n % 2.
6. Use a switch statement:
7. If the remainder is 0, display "This number is even".
8. If the remainder is 1, display "This number is odd".
9. Otherwise, display "Invalid input".
10. Stop the program.*/
import java.util.Scanner;

class EvenOddSwitch {
    public static void main(String args[]) {

        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = s.nextInt();

        switch (n % 2) {

            case 0:
                System.out.println("This number is even");
                break;

            case 1:
                System.out.println("This number is odd");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
/* OUTPUT
    Enter a number: 20
This number is even
    RESULT

Thus, the Java program successfully checks whether the given number is even or odd using a switch statement.*/

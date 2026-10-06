/*A354
AIM

To write a Java program to find the largest of three integers using if-else-if statements.

ALGORITHM
1. Start the program.
2. Import the Scanner class.
3. Declare three integer variables x, y and z.
4. Create a Scanner object to read input.
5. Read three integers from the user.
6. Check if x is greater than y and z.
7. If true, display "First number is largest".
8. Otherwise, check if y is greater than x and z.
9. If true, display "Second number is largest".
10. Otherwise, check if z is greater than x and y.
11. If true, display "Third number is largest".
12. Otherwise, display "The numbers are not distinct or equal".
13. Stop the program.*/

import java.util.Scanner;

class LargestOfThreeNumbers {
    public static void main(String args[]) {

        int x, y, z;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three integers:");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z) {
            System.out.println("First number is largest");
        } 
        else if (y > x && y > z) {
            System.out.println("Second number is largest");
        } 
        else if (z > x && z > y) {
            System.out.println("Third number is largest");
        } 
        else {
            System.out.println("The numbers are not distinct or equal");
        }
    }
}
/*OUTPUT
Sample Output
Enter three integers:
25
40
15
Second number is largest
RESULT

Thus, the Java program successfully finds the largest of three integers using if-else-if statements.*/

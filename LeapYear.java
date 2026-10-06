/*A354
  AIM

To write a Java program to check whether a given year is a leap year or not.

ALGORITHM
1. Start the program.
2. Import the Scanner class.
3. Create a Scanner object to read input.
4. Read the year from the user.
5. Check whether the year is divisible by 400.
6. If it is divisible by 400, set flag to true.
7. Otherwise, check whether the year is divisible by 100.
8. If it is divisible by 100, set flag to false.
9. Otherwise, check whether the year is divisible by 4.
10. If it is divisible by 4, set flag to true.
11. Otherwise, set flag to false.
12. If flag is true, display that the year is a leap year.
13. Otherwise, display that the year is not a leap year.
14. Stop the program.  */
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter any year: ");
        int year = s.nextInt();

        boolean flag = false;

        // Check leap year condition
        if (year % 400 == 0) {
            flag = true;
        } else if (year % 100 == 0) {
            flag = false;
        } else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }

        // Output result
        if (flag) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }

        s.close();
    }
}
/*  OUTPUT
Sample Output 1
Enter any year: 2024
Year 2024 is a leap year
RESULT

Thus, the Java program successfully checks whether the given year is a leap year or not.*/

/*A354
    AIM

To write a Java program to read the names and marks of 6 students and display the students who scored more than 60 marks.

ALGORITHM
1. Start the program.
2. Declare an integer array marks of size 6.
3. Declare a String array name of size 6.
4. Create a Scanner object to read input.
5. Read the name and marks of each student using a for loop.
6. Store the names in the name array.
7. Store the marks in the marks array.
8. Display the heading "Students scoring more than 60".
9. Traverse the marks array using a for loop.
10. Check whether each student's marks are greater than 60.
11. If the marks are greater than 60, display the student's name and marks.
12. Stop the program.*/

import java.util.Scanner;

public class MarksAbvSixty
{
    public static void main(String args[])
    {
        int marks[] = new int[6];
        String name[] = new String[6];
        int i;

        Scanner scanner = new Scanner(System.in);

        // Input
        for(i = 0; i < 6; i++)
        {
            System.out.print("Enter Name of Student and Marks of Subject " + (i + 1) + ": ");
            name[i] = scanner.next();
            marks[i] = scanner.nextInt();
        }

        // Output (marks > 60)
        System.out.println("\nStudents scoring more than 60:");

        for(i = 0; i < 6; i++)
        {
            if(marks[i] > 60)
            {
                System.out.println(name[i] + " : " + marks[i]);
            }
        }
    }
}
/*OUTPUT
Enter Name of Student and Marks of Subject 1: Ravi 75
Enter Name of Student and Marks of Subject 2: Sita 55
Enter Name of Student and Marks of Subject 3: Arun 82
Enter Name of Student and Marks of Subject 4: Priya 60
Enter Name of Student and Marks of Subject 5: Kiran 91
Enter Name of Student and Marks of Subject 6: Anu 48

Students scoring more than 60:
Ravi : 75
Arun : 82
Kiran : 91
RESULT

Thus, the Java program successfully displays the names and marks of students who scored more than 60 marks.*/

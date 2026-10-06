/*A354
AIM

To write a Java program to find the sum, largest number, and smallest number in a given array.

ALGORITHM
1. Start the program.
2. Declare and initialize an integer array with 10 elements.
3. Initialize sum to 0.
4. Initialize min and max with the first element of the array.
5. Traverse the array using a for loop.
6. Compare each element with max.
7. If the element is greater than max, assign it to max.
8. Compare each element with min.
9. If the element is smaller than min, assign it to min.
10. Add each element to sum.
11. Display the sum of the array elements.
12. Display the largest number in the array.
13. Display the smallest number in the array.
14. Stop the program.*/

import java.util.Scanner;
public class LargestSmallest
{
    public static void main(String args[])
    {
        int a[] = {23, 34, 13, 64, 72, 90, 10, 15, 9, 27};

        int sum = 0;
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }

            if (a[i] < min)
            {
                min = a[i];
            }

            sum = sum + a[i];
        }

        System.out.println("The sum is: " + sum);
        System.out.println("Largest number in the array is: " + max);
        System.out.println("Smallest number in the array is: " + min);
    }
}
/*OUTPUT
The sum is: 356
Largest number in the array is: 90
Smallest number in the array is: 9
RESULT

Thus, the Java program successfully finds the sum, largest number, and smallest number in the given array.*/

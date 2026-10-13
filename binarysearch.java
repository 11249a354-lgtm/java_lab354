/*A354
    Aim
To write a Java program to search for an element in a sorted array using Binary Search.
Algorithm:
    1\. Start the program.

2\. Read the number of elements from the user.

3\. Read the array elements in sorted order.

4\. Read the element to be searched.

5\. Initialize first = 0 and last = n - 1.

6\. Repeat while first <= last.

7\. Calculate mid = (first + last) / 2.

8\. If a[mid] equals the search element, display its position and set flag = 1.

9\. If a[mid] is less than the search element, set first = mid + 1.

10\. Otherwise, set last = mid - 1.

11\. If flag = 0, display "Element not found".

12\. Stop the program.*/
import java.util.Scanner;

class BinarySearch
{
    public static void main(String args[])
    {
        int i, mid, first, last, x, n, flag = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements in sorted order:");
        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        x = sc.nextInt();

        first = 0;
        last = n - 1;

        while(first <= last)
        {
            mid = (first + last) / 2;

            if(a[mid] == x)
            {
                flag = 1;
                System.out.println("Element found at position " + (mid + 1));
                break;
            }
            else if(a[mid] < x)
            {
                first = mid + 1;
            }
            else
            {
                last = mid - 1;
            }
        }
        if(flag == 0)
        {
            System.out.println("Element not found");
        }
    }
}
/*Sample Output
Enter number of elements: 5
Enter elements in sorted order:
10
20
30
40
50
Enter element to search: 30
Element found at position 3


Result
Thus, the Java program to search for an element using Binary Search was executed successfully.*/

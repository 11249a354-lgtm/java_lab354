/*a354
AIM

To write a Java program to arrange the elements of an array in ascending order.

ALGORITHM
1. Start the program.
2. Import the Scanner class.
3. Read the number of elements n.
4. Create an integer array of size n.
5. Read all the elements into the array.
6. Compare each element with the elements that follow it.
7. If a[i] is greater than a[j], swap the two elements.
8. Repeat the comparison until all elements are arranged in ascending order.
9. Display the sorted array.
10. Stop the program.*/ 

import java.util.Scanner;

public class 
AscendingOrder
{
public static void main(String[] args)
{
int n, temp;
Scanner s=new Scanner(System.in);
System.out.print("Enter number of elements you want in array:");n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if (a[i]>a[j])
{
temp=a[i];
a[j]=a[j];
a[j]=temp;
}
}
}
System.out.print("AscendingOrder:");
for (int i=0;i<n-1;i++)
{
System.out.print(a[i]+",");
}
System.out.print(a[n-1]);
}
}
/*OUTPUT
  Enter number of elements you want in array: 5
Enter all the elements:
50
20
40
10
30
AscendingOrder:10,20,30,40,50
  RESULT

Thus, the Java program successfully arranges the given array elements in ascending order.*/

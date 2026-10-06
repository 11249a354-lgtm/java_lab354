/* A354
AIM

To write a Java program to check whether a given number is an Armstrong number or not.

ALGORITHM
1. Start the program.
2.Import the Scanner class.
3.Read a positive integer n from the user.
4.Store the value of n in another variable nu.
5.Initialize num = 0.
6.Repeat the following steps while nu is not equal to 0:
7.Find the last digit using rem = nu % 10.
8.Find the cube of the digit and add it to num.
9.Remove the last digit using nu = nu / 10.
10.Compare num with the original number n.
11.If num == n, display "Armstrong Number".
12.Otherwise, display "Not an Armstrong Number".
13. Stop the program.*/

import java.util.Scanner; public class Armstrong
{
public static void main(String args[])
{
int n, nu, num=0, rem;
Scanner scan = new Scanner(System.in);

System.out.print("Enter any Positive Number : "); n = scan.nextInt();
nu = n; while(nu != 0)
{
rem = nu%10;
num = num + rem*rem*rem; nu = nu/10;
}
if(num == n)
{
System.out.print("Armstrong Number");
}
else
{
System.out.print("Not an Armstrong Number");
}
}
}
/*OUTPUT

Enter any Positive Number : 153
Armstrong Number
RESULT

Thus, the Java program successfully checks whether the given number is an Armstrong number or not.*/

/*A354
  AIM

To write a Java program to generate the Fibonacci series for a given number of terms using a method.

ALGORITHM
1.Start the program.
2.Import the Scanner class.
3.Read the value of n from the user.
4.Call the fibonacci(n) method.
5.In the fibonacci() method:
6.If n = 0, display 0.
7.If n = 1, display 0 1.
8.Otherwise, initialize a = 0 and b = 1.
9.Display the first two Fibonacci numbers, 0 and 1.
10.Use a for loop to calculate the next number:
nextNumber = a + b
11.Display nextNumber.
12.Set a = b and b = nextNumber.
13.Repeat until the required number of terms is generated.
14.Stop the program.*/

import java.util.Scanner; public class FibonacciSeries {
public static void main(String[] args) { Scanner s = new Scanner(System.in); System.out.print("Enter the value of n: "); int n = s.nextInt();
fibonacci(n);
}
public static void fibonacci(int n) { if (n == 0) {
System.out.println("0");
} else if (n == 1) { System.out.println("0 1");
} else {
System.out.print("0 1 "); int a = 0;
int b = 1;
for (int i = 1; i < n; i++) { int nextNumber = a + b;
System.out.print(nextNumber + " ");
a = b;
b = nextNumber;
}
}
}
}
/*OUTPUT
  Enter the value of n: 7
0 1 1 2 3 5 8 13
  RESULT

Thus, the Java program successfully generates the Fibonacci series for the given number of terms.*/

/*A354
Aim:
To write a Java program to demonstrate thread methods such as yield(), sleep(), and break.
Algorithm:
    1\. Start the program.

2\. Create three classes A, B and C by extending the Thread class.

3\. Override the run() method in all three classes.

4\. In thread A, print numbers from 1 to 5 and use yield() to give other threads a chance to execute.

5\. In thread B, print numbers from 1 to 3 and terminate the loop using break.

6\. In thread C, print numbers from 1 to 5 and use sleep() to pause the thread for 1500 milliseconds.

7\. Create objects for threads A, B and C in the main() method.

8\. Start all three threads using the start() method.

9\. Print the exit message from the main thread.

10\. Stop the program.*/

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                Thread.yield();
            }

            System.out.println("from thread A i=" + i);
        }

        System.out.println("exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("from thread B j=" + j);

            if (j == 3) {
                System.out.println("exit from B");
                break;
            }
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("thread C = " + k);

            if (k == 1) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Thread C interrupted");
                }
            }
        }
    }
}

public class Threadtest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Start thread A");

        a.start();
        b.start();
        c.start();

        System.out.println("exit from main thread");
    }
}import java.io.*;
class A extends Thread
{
public void run()
{
System.out.println("Thread A started"); for(int i=1;i<=4;i++)
{
System.out.println("from thread A i="+i);
}
System.out.println("exit from A");
}
}
class B extends Thread
{
public void run()
{
System.out.println("Thread B started"); for(int j=1;j<=4;j++)
{
System.out.println("from thread B j="+j);
}
System.out.println("exit from B");
}
}
class C extends Thread
{
public void run()
{
System.out.println("thread C started"); for(int k=1;k<=4;k++)
{
System.out.println("thread c ="+k);
}
System.out.println("exit from c");
}
}
class ThreadPriority
{
public static void main(String[]args)
 {
A threadA = new A();
B threadB = new B();
C threadC = new C(); threadC.setPriority(Thread.MAX_PRIORITY); threadB.setPriority(threadA.getPriority()+1); threadA.setPriority(Thread.MIN_PRIORITY); System.out.println("start thread A"); threadA.start();
System.out.println("start thread B"); threadB.start(); System.out.println("start thread C"); threadC.start();
System.out.println("end of main thread");
}
}
/*Output:
Start thread A
exit from main thread
from thread A i=1
from thread A i=2
from thread A i=3
from thread A i=4
from thread A i=5
exit from A
from thread B j=1
from thread B j=2
from thread B j=3
exit from B
thread C = 1
thread C = 2
thread C = 3
thread C = 4
thread C = 5

Result:
Thus, the Java program demonstrating the yield(), sleep(), and break statements in threads was executed successfully.*/

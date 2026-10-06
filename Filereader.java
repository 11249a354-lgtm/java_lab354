/*A354
  AIM

To write a Java program to read the contents of a file using the FileReader class.

ALGORITHM
1. Start the program.
2. Import the java.io.* package.
3. Create a FileReader object to open the file sample2.txt.
4. Declare an integer variable i.
5. Read the file character by character using the read() method.
6. Check whether the returned value is not equal to -1.
7. Convert the read value into a character.
8. Display the character on the screen.
9. Repeat the reading process until the end of the file is reached.
10. Close the file using fr.close().
11. If an exception occurs, catch and display the exception.
12. Stop the program.*/
  
import java.io.*; class Filereader
{
public static void main(String[]args)
{
try
{
FileReader fr=new FileReader("sample2.txt"); int i;
while((i=fr.read())!=-1)
{
System.out.println((char)i);
}
fr.close();
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}
/*OUTPUT

If sample2.txt contains the alphabets A to Z:

A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z
RESULT

Thus, the Java program successfully reads and displays the contents of the file using the FileReader class.*/

/*A354
    AIM

To write a Java program to create a file and write the uppercase English alphabets (A to Z) into the file using FileWriter.
import java.io.*;
1. Start the program.
2. Import the java.io.* package.
3. Create a FileWriter object for the file sample2.txt.
4. Initialize the character value i with ASCII value 65.
5. Repeat the loop while i is less than 91.
6. Write the character i into the file.
7. Increment i by 1.
8. Continue the loop until all alphabets from A to Z are written.
9. Close the file using fw.close().
10. If an exception occurs, catch and display the exception.
11. Stop the program.*/
class FileWriter
{
    public static void main(String[] args)
    {
        try
        {
            java.io.FileWriter fw = new java.io.FileWriter("sample2.txt");

            for(char i = 65; i < 91; i++)
            {
                fw.write(i);
            }

            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception :" + e);
        }
    }
}
/*OUTPUT
sample2.txt

ABCDEFGHIJKLMNOPQRSTUVWXYZ
    RESULT

Thus, the Java program successfully created the file sample2.txt and wrote the uppercase alphabets A to Z into it.*/

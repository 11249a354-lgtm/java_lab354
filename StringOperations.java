/*A354
AIM

To write a Java program to demonstrate various String operations such as length, character extraction, case conversion, substring, concatenation, comparison, searching, replacing, and trimming.

ALGORITHM
1. Start the program.
2. Create a String variable str with the value "Hello Java".
3. Find and display the length of the string.
4. Find and display the character at index 1.
5. Convert the string into uppercase and display it.
6. Convert the string into lowercase and display it.
7. Extract and display the substring starting from index 6.
8. Concatenate " Programming" with the string and display it.
9. Check whether the string contains "Java" and display the result.
10. Find and display the index of character 'J'.
11. Find and display the last index of character 'a'.
12. Replace "Java" with "World" and display the result.
13. Check whether the string starts with "Hello".
14. Check whether the string ends with "Java".
15. Create another string str2 with the value "Hello Java".
16. Compare str and str2 using the equals() method.
17. Create a string str3 with spaces around "Hello Java".
18. Remove the leading and trailing spaces using the trim() method.
19. Display all the results.
20. Stop the program.*/

public class StringOperations {
    public static void main(String[] args) {

        String str = "Hello Java";
        System.out.println("1. Length: " + str.length());
        System.out.println("2. Character at index 1: " + str.charAt(1));
        System.out.println("3. Uppercase: " + str.toUpperCase());
        System.out.println("4. Lowercase: " + str.toLowerCase());
        System.out.println("5. Substring: " + str.substring(6));
        System.out.println("6. Concatenation: " + str.concat(" Programming"));
        System.out.println("7. Contains 'Java': " + str.contains("Java"));
        System.out.println("8. Index of 'J': " + str.indexOf('J'));
        System.out.println("9. Last index of 'a': " + str.lastIndexOf('a'));
        System.out.println("10. Replace: " + str.replace("Java", "World"));
        System.out.println("11. Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("12. Ends with 'Java': " + str.endsWith("Java"));
        String str2 = "Hello Java";
        System.out.println("13. Equals: " + str.equals(str2));
        String str3 = "   Hello Java   ";
        System.out.println("14. Trim: " + str3.trim());
    }
}
/*OUTPUT
1. Length: 10
2. Character at index 1: e
3. Uppercase: HELLO JAVA
4. Lowercase: hello java
5. Substring: Java
6. Concatenation: Hello Java Programming
7. Contains 'Java': true
8. Index of 'J': 6
9. Last index of 'a': 9
10. Replace: Hello World
11. Starts with 'Hello': true
12. Ends with 'Java': true
13. Equals: true
14. Trim: Hello Java
RESULT

Thus, the Java program successfully demonstrates various String operations using built-in String methods.*/

/*A354
 AIM

To write a Java program to demonstrate the use of an interface by implementing an interface in a class.

ALGORITHM
1. Start the program.
2. Create an interface named Animal.
3. Declare an abstract method sound() inside the interface.
4. Create a class named Dog that implements the Animal interface.
5. Define the sound() method inside the Dog class.
6. Display "Dog Barks" when the sound() method is called.
7. Create an object of the Dog class.
8. Call the sound() method using the Dog object.
9. Display the output.
10. Stop the program.*/

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog Barks");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
/*OUTPUT
Dog Barks
RESULT

Thus, the Java program successfully demonstrates the implementation of an interface using the implements keyword.*/

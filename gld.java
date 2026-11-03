/*354 
AIM:

To write and execute a Java Applet program to demonstrate GridLayout using 10 buttons arranged in 5 rows and 2 columns.
1. Start.
2. Import the required AWT and Applet packages.
3. Create a class named gld that extends Applet.
4. Define the init() method.
5. Set GridLayout with 5 rows and 2 columns.
6. Create 10 buttons with labels A to J.
7. Add all the buttons to the applet.
8. Set the insets to 20 pixels on all sides.
9. Execute the applet.
10. Stop.*/

import java.awt.*;
import java.io.*;
import java.applet.Applet.*;
import java.applet.*;
/*<applet code="gld.class" height=300 width=300>
</applet>*/

public class gld extends Applet
{
public void init()
{ 
setLayout(new GridLayout(5,2));
Button b1=new Button("A");
Button b2=new Button("B");
Button b3=new Button("C");
Button b4=new Button("D");
Button b5=new Button("E");
Button b6=new Button("F");
Button b7=new Button("G");
Button b8=new Button("H");
Button b9=new Button("I");
Button b10=new Button("J");
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
}
public Insets getInsets()
{
return new Insets(20,20,20,20);
}}
/*
OUTPUT:

A    B
C    D
E    F
G    H
I    J
RESULT:

Thus, the Java Applet program to demonstrate GridLayout using 10 buttons was executed successfully.*/

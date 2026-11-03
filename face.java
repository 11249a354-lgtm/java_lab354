/*354
AIM:

To write and execute a Java Applet program to draw a human face using different graphical methods.
ALGORITHM:
1. Start.
2. Import the required AWT and Applet packages.
3. Create a class named face that extends Applet.
4. Define the paint() method using Graphics class.
5. Draw an oval to represent the face.
6. Draw two ovals to represent the eyes.
7. Draw small ovals to represent the pupils.
8. Use fillArc() to draw the nose and mouth.
9. Draw two ovals to represent the ears.
10. Execute the applet.
11. Stop.*/
import java.awt.*;
import java.io.*;
import java.applet.*;

public class face extends Applet
{
   /*
<applet code="face.class" width="300" height="300">
</applet>
*/ public void paint(Graphics g)
    {
        g.drawOval(40, 40, 120, 150);
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30, 20);

        g.drawOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);

        g.fillArc(85, 100, 30, 30, 0, 180);
        g.fillArc(60, 125, 80, 40, 180, 180);

        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
    }
}
/* OUTPUT:

RESULT:

Thus, the Java Applet program to draw a human face using graphical methods was executed successfully.*/

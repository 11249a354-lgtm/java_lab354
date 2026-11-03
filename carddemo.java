/*A354
AIM:

To write and execute a Java Applet program to demonstrate CardLayout using three buttons and ActionListener.
ALGORITHM:
1. Start.
2. Import the required AWT, Applet and Event packages.
3. Create a class named carddemo that extends Applet and implements ActionListener.
4. Declare three buttons, a Panel and a CardLayout object.
5. Define the init() method.
6. Create a panel and add it to the applet.
7. Set CardLayout to the panel.
8. Create three buttons.
9. Add ActionListener to all three buttons.
10. Add the buttons to the panel.
11. Define the actionPerformed() method.
12. Use CardLayout.next() to display the next button.
13. Execute the applet.
14. Stop.*/
import java.io.*; import
java.awt.*; import
java.applet.*;
import java.awt.event.*;
/*
<applet code="carddemo" width=250 height=150>
</applet>
*/
public class carddemo extends Applet implements ActionListener
{
Button b1,b2,b3,b4; Panel
buttonPanel;
CardLayout buttonCardLayout;
public void init()
{
buttonPanel=new Panel();
add(buttonPanel);
buttonCardLayout=new CardLayout();
buttonPanel.setLayout(buttonCardLayout);
b1=new Button("first Button");
b1.addActionListener(this);
buttonPanel.add(b1,"first Button");
b2=new Button("second Button");
b2.addActionListener(this);
buttonPanel.add(b2,"second Button");
b3=new Button("third button");
b3.addActionListener(this);
buttonPanel.add(b3,"third Button");
}
public void actionPerformed(ActionEvent e)
{
buttonCardLayout.next(buttonPanel);
}
}
/*RESULT:

Thus, the Java Applet program to demonstrate CardLayout using three buttons and ActionListener was executed successfully.*/

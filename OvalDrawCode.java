//Author: Husni Abuobeid
// Note:   Drawing an oval in green my favorite color.

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Container;
import java.awt.Color;

class Oval extends JPanel {
    private Color myColor;
    public void setColor(int red, int green, int blue) {
        myColor = new Color(red,green,blue);
    }
    public Color getColor() {
        return myColor;
    }

    Oval() {
        setColor(255,0,0);
    }

    Oval(int red, int green, int blue) {
        setColor(red,green,blue);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();
        g.setColor(Color.blue); // Setting color for rectangle
        g.fillRect(0,0,panelWidth,panelHeight/2);  // Drawing the rectangle
        g.setColor(myColor);    // Setting color for oval
        g.fillOval(0,0,panelWidth,panelHeight); // Drawing the oval
    }
}

class Rectangle extends JPanel {
    private Color myColor;
    public void setColor(int red, int green, int blue) {
        myColor = new Color(red,green,blue);
    }
    public Color getColor() {
        return myColor;
    }

    Rectangle() {
        setColor(255,0,0);
    }

    Rectangle(int red, int green, int blue) {
        setColor(red,green,blue);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        g.setColor(myColor);
        g.fillRect(0, 0, panelWidth, panelHeight/2);

    }
}

class OvalFrame extends JFrame {
    OvalFrame() {
        setTitle("OvalDraw");
        setBounds(200,200,300,400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Oval myOval = new Oval(100, 200, 100); //setting the oval to green
        Rectangle myRectangle = new Rectangle(0, 0, 150); //setting the rectangle to blue.
        Container contentPane = getContentPane();
        contentPane.add(myRectangle);
        contentPane.add(myOval);
    }
}

public class OvalDrawPlus {
    public static void main(String[] args) {
        System.out.println("OvalDrawPlus is now Starting...");
        OvalFrame myFrame = new OvalFrame();

        myFrame.setVisible(true);
    }
}

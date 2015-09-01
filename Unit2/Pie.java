/*
 * Pie.java
 * creates a pie chart
 */
import javax.swing.JApplet;

import java.awt.*;

public class Pie extends JApplet {

    public void paint (Graphics page){

    {
     
     
     int x,y;
     Font f = new Font("Segoe UI", Font.PLAIN, 26);
     int wd,ht;
     
     x = 50;
     y = 150;
     wd = 250;
     ht = 250;
     
     page.setColor(new Color(216, 0, 0));
     page.fillArc(x, y, wd, ht, 90, -126);
     page.drawString("
     page.setColor(new Color(0, 216, 0));
     page.fillArc(x, y, wd, ht, 270, 54);
     page.setColor(new Color(0, 0, 216));
     page.fillArc(x, y, wd, ht, 216, 54);
     page.setColor(new Color(216, 216, 0));
     page.fillArc(x, y, wd, ht, 126, 90);
     page.setColor(new Color(0, 216, 216));
     page.fillArc(x, y, wd, ht, 90, 36);

     //(250, 200) is the top left of a box around the oval

     //50 and 50 is the width and height of the box around the oval

     //90 is the startAngle.  0 is far right, 90 is the top of the oval

     //180 is the arcLength.  180 means starting at 90 and ending at 270 degrees
     
     page.setColor(Color.black);
     page.setFont(f);
     page.drawString("Household Spending on Various Expenses", 10, 30);
    }
}
}
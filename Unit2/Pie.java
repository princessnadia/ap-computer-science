/*
 * Pie.java
 * creates a pie chart
 */
import javax.swing.JApplet;

import java.awt.*;

public class Pie extends JApplet {

    public void paint (Graphics page){

    {
     
     
     Font f = new Font("SAO UI", Font.BOLD, 36);
     Font g = new Font("SAO UI", Font.BOLD, 24);
     page.setFont(g);
     int wd,ht;
     int x,y;
     
     x = 50;
     y = 150;
     wd = 250;
     ht = 250;
     
     page.setColor(new Color(216, 0, 0));
     page.fillArc(x, y, wd, ht, 90, -126);
     page.drawString("RENT AND UTILITIES - 35%", 290, 200);
     page.setColor(new Color(0, 216, 0));
     page.fillArc(x, y, wd, ht, 270, 54);
     page.drawString("TRANSPORTATION - 15%", 250, 400);
     page.setColor(new Color(0, 0, 216));
     page.fillArc(x, y, wd, ht, 216, 54);
     page.drawString("FOOD - 15%", 10, 400);
     page.setColor(new Color(216, 216, 0));
     page.fillArc(x, y, wd, ht, 126, 90);
     page.drawString("EDU. - 25%", 5, 180);
     page.setColor(new Color(0, 216, 216));
     page.fillArc(x, y, wd, ht, 90, 36);
     page.drawString("MISC. - 10%", 50, 150);

     //(250, 200) is the top left of a box around the oval

     //50 and 50 is the width and height of the box around the oval

     //90 is the startAngle.  0 is far right, 90 is the top of the oval

     //180 is the arcLength.  180 means starting at 90 and ending at 270 degrees
     
     page.setColor(Color.black);
     page.setFont(f);
     page.drawString("HOUSEHOLD SPENDING ON VARIOUS EXPENSES", 20, 30);
    }
}
}
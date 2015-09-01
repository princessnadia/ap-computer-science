//****************************************************************

//   Shapes.java

// ****************************************************************

import javax.swing.JApplet;

import java.awt.*;

public class Shapes extends JApplet {

    public void paint (Graphics page){

    {

     // Declare variables

     int x, y;    // x and y coordinates of upper left-corner of each shape

     int width, height; // width and height of each shape 

     // Assign the corner point and width and height

     x = 200;

     y = 150;

     width = 100;

     height = 70;

    

     // Set the color for the next shape to be drawn

     page.setColor(Color.blue);

     // Draw the rectangle

     page.fillRect(x, y, width, height);

     //x and y are the top left corner of the rectangle

     //width and height are the width and height

     

     page.setColor(Color.red);

     page.drawOval(100, 120, 50, 60);

     //(100,120) is the top left of a box around the oval

     //50 is the width and 60 the height of the box around the oval

     //drawOval instead of fillOval means it will not be filled in

     

     page.setColor(new Color(100, 150, 210));

     //RGB of red 100, green 150, blue 210, max number is 255

     page.fillArc(250, 200, 50, 50, 90, 180);

     //(250, 200) is the top left of a box around the oval

     //50 and 50 is the width and height of the box around the oval

     //90 is the startAngle.  0 is far right, 90 is the top of the oval

     //180 is the arcLength.  180 means starting at 90 and ending at 270 degrees

     

     page.setColor(Color.black);

     page.drawString("Hello", 30, 30);

     //print Hello at the point (30, 30)

     page.setColor(Color.green);

     page.drawLine(20, 50, 40, 110);

     //draws a line from (20, 50) to (40, 110)

    }

}

}

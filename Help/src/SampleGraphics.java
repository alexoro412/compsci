import java.applet.Applet;
//We are also using Point and a class called Graphics, so import this too
import java.awt.*;

//Here we need the "extends Applet" key phrase to make the applet work
public class SampleGraphics extends Applet{
    /*
    You'll notice that this in not the normal main method.
    This is the applet version of the main method
    */
    public void paint(Graphics g) {
        //draw a cirle (oval with equal height and width)
        //API here: http://docs.oracle.com/javase/7/docs/api/java/awt/Graphics.html
        //g.drawLine(0, 0, 100, 100);
        //g.drawOval(20, 50, 100, 100);
        //g.drawOvel()
        g.drawOval(0, 0, 400, 400);
        g.drawOval(25,25,350,350);
        g.drawOval(50,50,300,300);
        g.drawOval(75,75,250,250);
        g.drawOval(100, 100, 200, 200);
        g.drawOval(125,125,150,150);
        g.drawOval(150, 150, 100, 100);
        g.drawOval(175, 175, 50, 50);
        g.drawLine(0, 200, 400, 200);
        g.drawLine(200, 0, 200, 400);
    }


}

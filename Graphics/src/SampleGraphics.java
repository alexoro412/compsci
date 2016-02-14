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
        StickFigurePrimitive alex = new StickFigurePrimitive(5,1);
        g.drawOval(30,30,30,30);
        alex.draw(g);

        //draw(Graphics g);
    }


}

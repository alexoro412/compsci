import java.applet.Applet;
import java.awt.*;

public class GoldenRectangleApplet extends Applet
{
	public void paint(Graphics g)
	{
		GoldenRectangle r = new GoldenRectangle(10,10,300,'L');
		for (int i = 0; i < 10; i++)
		{
			g.drawRect(r.getX(), r.getY(), r.getWidth(), r.getHeight());
			r = r.getNextGoldenRectangle();
		}
	}
}

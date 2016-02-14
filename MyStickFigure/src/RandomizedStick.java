import java.applet.Applet;
import java.awt.Graphics;
import java.util.*;
public class RandomizedStick extends Applet{
	public void paint(Graphics g){
//		StickFigurePrimitive me = new StickFigurePrimitive();
//		me.draw(g);
		int i = 0;
		Random r = new Random();
		while(i<5000){
			StickFigurePrimitive me = new StickFigurePrimitive(r.nextInt(500),r.nextDouble()+0.5);
//			me.translate(r.nextInt(500));
			me.setColor(r.nextInt(255),r.nextInt(255),r.nextInt(255));
			me.draw(g);
			i++;
		}
	}
	
}

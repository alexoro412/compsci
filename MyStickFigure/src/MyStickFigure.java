import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;

public class MyStickFigure extends Applet{
	public void paint(Graphics g){
		
		double myScale = .8;
		
		Point neck = new Point(100,100);
		Point clavicle = new Point(100,150);
		Point hip = new Point(100,200);
		Point leftHand = new Point(75,125);
		Point rightHand = new Point(125,125);
		Point leftFoot = new Point(75,250);
		Point rightFoot = new Point(125,250);
		Point head = new Point(100,75);
		int radius = 25;
		//head.x;
		//g.drawOval(x, y, width, height);
		g.drawOval(head.x-radius, head.y-radius, radius*2, radius*2);
		g.drawLine(clavicle.x, clavicle.y, neck.x, neck.y);
		g.drawLine(clavicle.x, clavicle.y, hip.x, hip.y);
		
		g.drawLine(clavicle.x, clavicle.y, leftHand.x, leftHand.y);
		g.drawLine(clavicle.x, clavicle.y, rightHand.x, rightHand.y);
		
		g.drawLine(hip.x, hip.y, rightFoot.x, rightFoot.y);
		g.drawLine(hip.x, hip.y, leftFoot.x, leftFoot.y);
		
		
		
		//g.drawOval(head.x-radius, head.y-radius, radius*2, radius*2);
		
		//head.setLocation(head.x*myScale, head.y*myScale);
		
		double radius2 = radius * myScale;
		
		int radius3 = (int)radius2;
		
		Point head2 = new Point((int)(head.x*myScale), (int)(head.y*myScale));
		
		System.out.println(head.x + " " + head.y);
		
		int displacement = 200;
		int heightDisplaced = 50;
		//heightDisplaced = (int)(myScale * 10 + 30);
		
		g.drawOval(head2.x-radius3+displacement, head2.y-radius3+heightDisplaced, radius3*2, radius3*2);
		g.drawLine((int)(clavicle.x*myScale)+displacement, (int)(clavicle.y*myScale)+heightDisplaced, (int)(neck.x*myScale)+displacement, (int)(neck.y*myScale)+heightDisplaced);
		g.drawLine((int)(hip.x*myScale)+displacement, (int)(hip.y*myScale)+heightDisplaced, (int)(neck.x*myScale)+displacement, (int)(neck.y*myScale)+heightDisplaced);
		g.drawLine((int)(clavicle.x*myScale)+displacement, (int)(clavicle.y*myScale)+heightDisplaced, (int)(leftHand.x*myScale)+displacement, (int)(leftHand.y*myScale)+heightDisplaced);
		g.drawLine((int)(clavicle.x*myScale)+displacement, (int)(clavicle.y*myScale)+heightDisplaced, (int)(rightHand.x*myScale)+displacement, (int)(rightHand.y*myScale)+heightDisplaced);
		g.drawLine((int)(hip.x*myScale)+displacement, (int)(hip.y*myScale)+heightDisplaced, (int)(rightFoot.x*myScale)+displacement, (int)(rightFoot.y*myScale)+heightDisplaced);
		g.drawLine((int)(hip.x*myScale)+displacement, (int)(hip.y*myScale)+heightDisplaced, (int)(leftFoot.x*myScale)+displacement, (int)(leftFoot.y*myScale)+heightDisplaced);
		
//		g.drawLine(clavicle.x, clavicle.y, neck.x, neck.y);
//		g.drawLine(clavicle.x, clavicle.y, hip.x, hip.y);
//		
//		g.drawLine(clavicle.x, clavicle.y, leftHand.x, leftHand.y);
//		g.drawLine(clavicle.x, clavicle.y, rightHand.x, rightHand.y);
//		
//		g.drawLine(hip.x, hip.y, rightFoot.x, rightFoot.y);
//		g.drawLine(hip.x, hip.y, leftFoot.x, leftFoot.y);
	}
}

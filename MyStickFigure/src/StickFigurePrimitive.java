/**
 * Stick Figure Primitive Class
 * Author: Michael Ehrenfried
 * Date: 8/27/2005
 **/
import java.awt.Color;
import java.awt.Graphics;

public class StickFigurePrimitive {
	private double scaleFactor;
	private int myX;
	private int myY;
	private int myRed;
	private int myGreen;
	private int myBlue;

	public StickFigurePrimitive() {
		myY = 300;
		myX = 200;
		scaleFactor = 1;
	}

	public StickFigurePrimitive(double scale) {
		myY = 300;
		myX = 200;
		scaleFactor = scale;
	}

	public StickFigurePrimitive(int x) {
		myY = 300;
		myX = x;
		scaleFactor = 1;
	}

	public StickFigurePrimitive(int x, double scale) {
		myY = 300;
		myX = x;
		scaleFactor = scale;
	}

	public void draw(Graphics g) {
		g.setColor(new Color(myRed, myGreen, myBlue));
		g.drawOval((int) (myX - scaleFactor * 25), (int) (myY - scaleFactor * 200), (int) (scaleFactor * 50),
				(int) (scaleFactor * 50)); // head
		g.drawLine((int) (myX), (int) (myY - scaleFactor * 150), myX, (int) (myY - scaleFactor * 50)); // body
		g.drawLine((int) (myX - scaleFactor * 25), (int) (myY - scaleFactor * 125), myX,
				(int) (myY - scaleFactor * 100)); // left arm
		g.drawLine((int) (myX + scaleFactor * 25), (int) (myY - scaleFactor * 125), myX,
				(int) (myY - scaleFactor * 100)); // right arm
		g.drawLine((int) (myX - scaleFactor * 25), myY, myX, (int) (myY - scaleFactor * 50)); // left
																								// leg
		g.drawLine((int) (myX + scaleFactor * 25), myY, myX, (int) (myY - scaleFactor * 50)); // right
																								// leg
	}

	public void setColor(int r, int g, int b) {
		myRed = r;
		myGreen = g;
		myBlue = b;
	}

	public void setColor(char eye) {
		if (eye == 'l') {
			myRed = 255;
			myGreen = 0;
			myBlue = 0;
		}
		if (eye == 'r') {
			myRed = 0;
			myGreen = 0;
			myBlue = 255;
		}
	}

	public void getDarker() {
		if (myRed > 20)
			myRed -= 20;
		if (myGreen > 20)
			myGreen -= 20;
		if (myBlue > 20)
			myBlue -= 20;
	}

	public void translate(int x) {
		myX += x;
	}

	public StickFigurePrimitive duplicate() {
		StickFigurePrimitive temp;
		temp = new StickFigurePrimitive(myX, scaleFactor);
		temp.setColor(myRed, myGreen, myBlue);
		return temp;
	}
}
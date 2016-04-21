import java.applet.Applet;
import java.awt.*;

public class RecursiveDrawing extends Applet {

	public void paint(Graphics g) {
		int upperLeft = 10;
		int size = 100;
//		g.drawRect(upperLeft, upperLeft, size, size);
//		rectangleShrink(upperLeft, size, g, 8);
//        g.drawOval(0,0,500,500);
//        twoCircleDraw(0,0,500,500,g,5);
//        twoCircle(upperLeft,size,g,8);
        Point top = new Point(400,0);
        Point left = new Point(0,800);
        Point right = new Point(800,800);
        drawSie(top,left,right,g,7);
	}

    private void drawSie(Point a, Point b, Point c, Graphics g, int depth){
        if(depth > 0){
            Point ab = new Point((a.x+b.x)/2, (a.y+b.y)/2);
            Point bc = new Point((c.x+b.x)/2, (c.y+b.y)/2);
            Point ac = new Point((a.x+c.x)/2, (a.y+c.y)/2);
            drawTri(a,ab,ac,g);
            drawTri(b,ab,bc,g);
            drawTri(c,ac,bc,g);
            drawSie(a,ab,ac,g,depth-1);
            drawSie(b,ab,bc,g,depth-1);
            drawSie(c,ac,bc,g,depth-1);
//            drawTri();
        }
    }

    private void drawTri(Point a, Point b, Point c, Graphics g){
        g.drawLine(a.x,a.y,b.x,b.y);
        g.drawLine(a.x,a.y,c.x,c.y);
        g.drawLine(b.x,b.y,c.x,c.y);
    }

    private void twoCircleDraw(int x, int y, int w, int h, Graphics g, int depth){
        g.drawOval(x + w/4, y, w/2, h/2);
        g.drawOval(x + w/4, y+h/2, w/2, h/2);
        if(depth>0){
            twoCircleDraw(x + w/4, y, w/2, h/2, g, depth-1);
            twoCircleDraw(x + w/4, y+h/2, w/2, h/2, g, depth-1);
        }
    }

	private void twoCircle(int origUpperLeft, int origSize, Graphics g, int depth){
        int newUpperLeft = origUpperLeft + origSize;
        int newSize = origSize / 2;
        g.drawOval(newUpperLeft, newUpperLeft, newSize, newSize);
        g.drawOval(newUpperLeft, newUpperLeft, newSize, newSize);
        if(depth > 0){
            twoCircle(newUpperLeft, newSize, g, depth-1);
        }
    }

	private void rectangleShrink(int origUpperLeft, int origSize, Graphics g, int depth) {
		int newUpperLeft = origUpperLeft + origSize;
		int newSize = origSize / 2;
		g.drawRect(newUpperLeft, newUpperLeft, newSize, newSize);
		if (depth > 0) {
			rectangleShrink(newUpperLeft, newSize, g, depth - 1);
		}
	}

}

import java.awt.Point;
public class Rectangle
{
	private Point p;
	private int height;
	private int width;

	public Rectangle()
	{
		p = new Point(0,0);
		height = 0;
		width = 0;
	}
	public Rectangle(int inX, int inY, int inHeight, int inWidth)
	{
		p = new Point(inX, inY);
		height = inHeight;
		width = inWidth;
	}

	public int getX()
	{
		return (int)p.getX();
	}

	public int getY()
	{
		return (int)p.getY();
	}

	public int getWidth()
	{
		return width;
	}

	public int getHeight()
	{
		return height;
	}

	public void setLocation(int newX, int newY)
	{
		p.setLocation(newX, newY);
	}

	public void setLocation(Point newP)
	{
		p.setLocation(newP);
	}

	public void translate(int dx, int dy)
	{
		p.translate(dx,dy);
	}

	public void setSize(int newHeight, int newWidth)
	{
		height = newHeight;
		width = newWidth;
	}

	public boolean contains(int someX, int someY)
	{
		return someX >= p.getX() &&
		       someY >= p.getY() &&
		       someX <= p.getX()+width &&
		       someY <= p.getY()+height;
	}

	public boolean contains(Point p2)
	{
		return p2.getX() >= p.getX() &&
		       p2.getY() >= p.getY() &&
		       p2.getX() <= p.getX()+width &&
		       p2.getY() <= p.getY()+height;
	}

	public String toString()
	{
		return "Rectangle: x="+p.getX()+" y="+p.getY()+" height="+height+" width="+width;
	}
}

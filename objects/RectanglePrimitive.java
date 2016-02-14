public class RectanglePrimitive
{
	// instance data
	private int x;
	private int y;
	private int height;
	private int width;

	//constructors
	public RectanglePrimitive()
	{
		x = 0;
		y = 0;
		height = 0;
		width = 0;
	}
	public RectanglePrimitive(int inX, int inY, int inWidth, int inHeight)
	{
		x = inX;
		y = inY;
		height = inHeight;
		width = inWidth;
	}

	// accessors
	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public int getWidth()
	{
		return width;
	}

	public int getHeight()
	{
		return height;
	}

	//mutators
	public void setLocation(int newX, int newY)
	{
		x = newX;
		y = newY;
	}

	public void setLocation(MyPoint p)
	{
		x = p.getX();
		y = p.getY();
	}

	public void translate(int dx, int dy)
	{
		x+=dx;
		y+=dy;
	}

	public void setSize(int newHeight, int newWidth)
	{
		height = newHeight;
		width = newWidth;
	}

	//more accessors
	public boolean contains(int someX, int someY)
	{
		return someX >= x &&
		       someY >= y &&
		       someX <= x+width &&
		       someY <= y+height;
	}

	public boolean contains(MyPoint p)
	{
		return p.getX() >= x &&
		       p.getY() >= y &&
		       p.getX() <= x+width &&
		       p.getY() <= y+height;
	}

	public String toString()
	{
		return "Rectangle: x="+x+" y="+y+" height="+height+" width="+width;
	}
}

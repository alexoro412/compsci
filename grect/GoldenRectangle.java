import java.awt.*;

public class GoldenRectangle extends Rectangle
{

	public GoldenRectangle()
	{
		super();
		int h = 100;
		int w = (int)((double)(h) * 1.618);
		this.setSize(h,w);
	
	}	
	public GoldenRectangle(int x, int y, int shortSide, char orientation)
	{
		super();
		this.setLocation(new Point(x,y));
		if (orientation == 'W')
		{
			int h = shortSide;
			int w = (int)((double)(shortSide) * 1.618);
			this.setSize(h,w);
		}
		else if (orientation == 'L')
		{
			int w = shortSide;
			int h = (int)((double)(shortSide) * 1.618);
			this.setSize(h,w);
		}
	}

	public GoldenRectangle getNextGoldenRectangle(){
		if(this.getHeight() > this.getWidth())
		{
			//g = new GoldenRectangle();
			//g.setLocation(0,0);
			//g.setSize(( (int)((double)(shortSide) * 1.618  ), this.getWidth());
		
			return new GoldenRectangle(this.getX(),this.getY(),(int)(this.getWidth() / 1.618),'W');
		}
		else if(this.getWidth() > this.getHeight())
		{
			return new GoldenRectangle(this.getX(),this.getY(),(int)(this.getHeight()/1.618),'L');
		}
		return new GoldenRectangle();
	}




}

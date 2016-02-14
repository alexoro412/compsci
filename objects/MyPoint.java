//First TB0 class
//important points
//	1.  instance data and their scope (vs. local vars)
//	2.  each intance of the class has its own instance data
//	3.  public vs. private
//	4.  no return type (constructors) vs. void vs. data type
//	5.  keyword this (this refers to the object which called the method)
//	6.  constructors vs. accessors vs. mutators
//	7.  How to use the class

public class MyPoint {

	// instance data - data that defines a class
	private int x;
	private int y;

	// constructor(s) - because there is more than one, the constructor is overloaded
	public MyPoint() {
		x = 0;
		y = 0;
	}

	// constructor
	public MyPoint(int startX, int startY) {
		x = startX;
		y = startY;
	}

	// constructor
	public MyPoint(MyPoint p) {
		x = p.getY();
		y = p.getX();
	}

	// accessors (or getters)
	public int getX() {
		return x;
	}

	public int getY() {
		return y;	
	}

	public boolean equals(MyPoint p) {
		return x == p.getX() && y == p.getY();
	}

	// mutators (or setters)
	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public void setLocation(int newX, int newY) {
		x = newX;
		y = newY;
	}

	public void setLocation(double newX, double newY) {
		x = (int)(newX);
		y = (int)(newY);
	}

	public void setLocation(MyPoint p) {
		x = p.getX();
		y = p.getY();
	}

  //more accessors
	public String toString() {
		return "MyPoint: (" + x + "," + y + ")";
	}

	public double distance(MyPoint p) {
		return Math.sqrt(Math.pow((x - p.getX()),2) + Math.pow((y-p.getY()),2));	
	}
}

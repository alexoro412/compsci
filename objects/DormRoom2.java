public class DormRoom2
{
	private double myWidth;
	private double myLength;
	private String myName;

	public DormRoom2()
	{
		myWidth=10;
		myLength=15;
		myName="Room";
	}
	public DormRoom2(double width, double length)
	{
		myWidth = width;
		myLength = length;
		myName = "Room";
	}
	public DormRoom2(String room)
	{
		myWidth = 10;
		myLength = 15;
		myName = room;
	}
	public DormRoom2(double width, double length, String room)
	{
		myWidth = width;
		myLength = length;
		myName = room;
	}
	public double getWidth(){
		return myWidth;
	}
	public double getLength(){
		return myLength;
	}
	public String getName(){
		return myName;
	}
	public double getArea(){
		return myWidth * myLength;
	}
	public String toString(){
		return "DormRoom:\nWidth = " + myWidth + "\nLength = " + myLength + "\nName = " + myName;
	}

	public void setWidth(double newWidth){
		this.myWidth = newWidth;
	}
	public void setLength(double newLength){
		this.myLength = newLength;
	}
	public void setProportionalWidth(double newWidth){
		double area = getArea();
		this.myWidth = newWidth;
		this.myLength = area / this.myWidth;
	}
	public void setProportionalLength(double newLength){
		double area = getArea();
		this.myLength = newLength;
		this.myWidth = area / this.myLength;
	}



}

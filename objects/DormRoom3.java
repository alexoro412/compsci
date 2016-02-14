public class DormRoom3
{
	private double myWidth;
	private double myLength;
	private String myName;
	private int maxOccupancy;
	private final int ratio = 72;

	public DormRoom3()
	{
		myWidth=10;
		myLength=15;
		myName="Room";
		this.calculateMaxOccupancy();
	}
	public DormRoom3(double width, double length)
	{
		myWidth = width;
		myLength = length;
		myName = "Room";
		this.calculateMaxOccupancy();
	}
	public DormRoom3(String room)
	{
		myWidth = 10;
		myLength = 15;
		myName = room;
		this.calculateMaxOccupancy();
	}
	public DormRoom3(double width, double length, String room)
	{
		myWidth = width;
		myLength = length;
		myName = room;
		this.calculateMaxOccupancy();
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
		this.calculateMaxOccupancy();
	}
	public void setLength(double newLength){
		this.myLength = newLength;
		this.calculateMaxOccupancy();
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
	private void calculateMaxOccupancy(){
		this.maxOccupancy = (int)(this.getArea()/ratio);	
	}
	public int getMaxOccupancy(){
		return this.maxOccupancy;
	}


}

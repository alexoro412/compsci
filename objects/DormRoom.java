public class DormRoom
{
	private double myWidth;
	private double myLength;
	private String myName;

	public DormRoom()
	{
		myWidth=10;
		myLength=15;
		myName="Room";
	}
	public DormRoom(double width, double length)
	{
		myWidth = width;
		myLength = length;
		myName = "Room";
	}
	public DormRoom(String room)
	{
		myWidth = 10;
		myLength = 15;
		myName = room;
	}
	public DormRoom(double width, double length, String room)
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

}

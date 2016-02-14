public class DormRoom4
{
	private double myWidth;
	private double myLength;
	private String myName;
	private int maxOccupancy;
	private final int ratio = 72;

	private int occupancy;
	private Student Student1;
	private Student Student2;	
	private Student Student3;
	private Student Student4;

	public DormRoom4()
	{
		myWidth=10;
		myLength=15;
		myName="Room";
		this.calculateMaxOccupancy();
	}
	public DormRoom4(double width, double length)
	{
		myWidth = width;
		myLength = length;
		myName = "Room";
		this.calculateMaxOccupancy();
	}
	public DormRoom4(String room)
	{
		myWidth = 10;
		myLength = 15;
		myName = room;
		this.calculateMaxOccupancy();
	}
	public DormRoom4(double width, double length, String room)
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
	public boolean assignNewStudent(Student o){
		if(this.occupancy < 4){
			if(this.Student1 == null){
				this.Student1 = o;
				this.Student1.roomAssignment = this.myName;
			}else if(this.Student2 == null){
				this.Student2 = o;this.Student2.roomAssignment = this.myName;
			}else if(this.Student3 == null){
				this.Student3 = o;this.Student3.roomAssignment = this.myName;
			}else if(this.Student4 == null){
				this.Student4 = o;this.Student4.roomAssignment = this.myName;
			}else{
				return false;
			}
			return true;
		}
		return false;
	}
	public boolean removeStudent(Student o){
		if(this.Student1 != null && this.Student1.equals(o)){
			this.Student1 = null;
		}else if(this.Student2 != null && this.Student2.equals(o)){
			this.Student2 = null;
		}else if(this.Student3 != null && this.Student3.equals(o)){
			this.Student3 = null;
		}else if(this.Student4 != null && this.Student4.equals(o)){
			this.Student4 = null;
		}else{
			return false;
		}
		this.occupancy -= 1;
		return true;
	}
	public boolean switchStudent(Student oldO, Student newO){
		boolean remove = false;
		if(Student1 != null && oldO.equals(Student1))
		{
			this.removeStudent(Student1);
			remove = true;
		}else if(Student2 != null && oldO.equals(Student2))
		{
			this.removeStudent(Student2);
			remove = true;
		}else if(Student3 != null && oldO.equals(Student3))
		{
			this.removeStudent(Student3);remove = true;
		}else if(Student4 != null && oldO.equals(Student4))
		{
			this.removeStudent(Student4);remove = true;
		}
		boolean assigned = this.assignNewStudent(newO);
		return assigned && remove;
	}
	public boolean isStudent(Student o){
		if(this.Student1 != null && this.Student1.equals(o)){
			return true;
		}else if(this.Student2 != null && this.Student2.equals(o)){
			return true;
		}else if(this.Student3 != null && this.Student3.equals(o)){
			return true;
		}else if(this.Student4 != null && this.Student4.equals(o)){
			return true;
		}else{
			return false;
		}
	}
	public void printStudents(){
		System.out.println(Student1);
		System.out.println(Student2);
		System.out.println(Student3);
		System.out.println(Student4);
	}

}

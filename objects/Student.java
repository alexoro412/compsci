public class Student{

String firstName;
String lastName;
String roomAssignment;
String SSN;
char gender;

public Student(String firstName, String lastName, char gender, String SSN){
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.SSN = SSN;
}
public String getFirstName(){
	return this.firstName;
}
public String getLastName(){
	return this.lastName;
}
public String getName(){
	return this.lastName + ", " + this.firstName;
}
public String getSSN(){
	return this.SSN;
}
public char getGender(){
	return this.gender;
}
public String getRoomAssignment(){
	return this.roomAssignment;
}
public void setRoomAssignment(String s){
	this.roomAssignment = s;
}
public boolean equals(Student s){
	return this.lastName.equals(s.getLastName()) && this.firstName.equals(s.getFirstName()) && this.SSN.equals(s.getSSN());
}
public String toString(){
	return this.getName() + " - " + this.getSSN() + " - " + this.getGender() + " - " + this.getRoomAssignment();
}

}

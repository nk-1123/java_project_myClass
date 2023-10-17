package mypackage;

public class Student {
Student() {
	//default constructor
}
Student(int admNo, String sName, String sClass){
	//parameter constructor
	this.admNo = admNo;
	this.sName = sName;
	this.sClass = sClass;
}

private int admNo;
private String sName;
private String sClass;
public int getAdmNo() {
	return admNo;
}
public void setAdmNo(int admNo) {
	this.admNo = admNo;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public String getsClass() {
	return sClass;
}
public void setsClass(String sClass) {
	this.sClass = sClass;
}

public String toString() {
	return "Student admission number is: " + this.admNo + ", name is: " + this.sName +  ", Class is: " + this.sClass;
}

}

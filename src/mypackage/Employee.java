package mypackage;

import java.util.Objects;
import java.util.Comparator;

public class Employee implements Comparable<Employee> {


	private String empName; //camel cased
	private int empId;
	private double empSal;
	private String deptName;
	//all above are instance variables cause we will create multiple instances of these attributes
	//static variables are class variables which is common across all employee. eg: company name
	public Employee() {
		System.out.println("emp created");
	}
	public Employee(int empId, String empName, String deptName, double empSal) {
		this.empId=empId;
		this.empName = empName;
		this.empSal=empSal;
		this.deptName=deptName;
	}
	public String getEmpName() {
		return this.empName;  
	}
	public void setEmpName(String empName) {
		this.empName = empName; //greater control over functions but if data is exposed then more control over the data
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	//using user defined function
//	public static Comparator<Employee> empNameComparator = new Comparator<Employee>() {
//		public int compare(Employee e1, Employee e2) {
//			String emp1 = e1.getEmpName().toUpperCase(); 
//			String emp2 = e2.getEmpName().toUpperCase();
//			return emp1.compareTo(emp2);  //or you can use ignorecase as well
//		}
//	};
	// to compare by names
	@Override
	public int compareTo(Employee o) {
//		return this.getEmpName().compareToIgnoreCase(o.getEmpName());  //to sort acc to name
//		to sort acc to emp id
		
		if(this.getEmpId()<o.getEmpId())
			return -1;
		else if(this.getEmpId()>o.getEmpId())
			return 1;
		else return 0;
	}
	
	//to print object values
	public String toString() {
		return "Employee name is: " + this.empName + ", employee id is: " + this.empId + ", emp department is: " + this.empSal + ", emp salary is: " + this.empSal;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId;
	}
	
	
	
}




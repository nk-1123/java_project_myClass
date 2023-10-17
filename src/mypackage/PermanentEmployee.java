package mypackage;

public class PermanentEmployee extends Employee {
	private double pfPercent=getPfPercent();
	private double pfAmount;
//	private double empSal=super.getEmpSal(); //no need to write this
	
	public PermanentEmployee(int empId, String empName, String deptName, double empSal) {
		super(empId, empName, deptName, empSal);
	}

	
	public double getPfPercent() {
		return pfPercent;
	}


	public void setPfPercent(double pfPercent) {
		this.pfPercent = pfPercent;
	}


	public double getPfAmount() {
		return pfAmount;
	}


	public void setPfAmount(double pfAmount) {
		this.pfAmount = pfAmount;
	}


	public void calcPfAmount() {
		this.pfAmount=getEmpSal()*(pfPercent/100);
		System.out.println("Employee PF Amount is: "+ pfAmount);
	}
	
	public String toString() {
		
		return "Employee PF Amount is: " + pfAmount;
	}
	
}

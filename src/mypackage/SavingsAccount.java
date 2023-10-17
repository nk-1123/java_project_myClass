package mypackage;

public class SavingsAccount implements Account {
	private double roi=6.0;
	private double deposit;
	private int time;
	
	public SavingsAccount(double deposit, int time) {
//		this.roi=roi;
		this.deposit=deposit;
		this.time = time;
	}
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	
	public double getInterest() {
		return roi;
	}

	public void setInterest(double roi) {
		this.roi = roi;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	@Override 
	public void calcInterest() {
		double interest = (roi*deposit*time)/100;
		System.out.println("interest on savings account with deposit amount "+getDeposit()+" is: "+interest);
	}
}

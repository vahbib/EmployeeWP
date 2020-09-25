package EmployeeWageCode;

public class UC2 {
	static final int full_time = 1;
	static final int wage_per_hour = 20;
	
	public static void main(String[] args) {
		int emphours = 0;
		int empwage = 0;
		
		int empcheck = (int) Math.floor(Math.random()*10)%2;
		if (empcheck == full_time)
			emphours = 8;
		else
			emphours = 0;
		empwage = emphours*wage_per_hour;
		System.out.println("Daily Employee Wage :" +empwage);
		
	}
	

}

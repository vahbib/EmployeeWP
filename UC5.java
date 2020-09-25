package EmployeeWageCode;

public class UC5 {
	static final int full_time = 1;
	static final int wage_per_hour = 20;
	static final int part_time = 2;
	static final int no_of_working_days = 20;
	
	public static void main(String[] args) {
		int emphours = 0;
		int empwage = 0;
		int totalempwage = 0;
		for (int i = 0; i<no_of_working_days; i++) {
		
			int empcheck = (int) Math.floor(Math.random()*10)%3;
		
			if (empcheck == full_time)
				emphours = 8;
			else if (empcheck == part_time)
				emphours = 8;
			else
				emphours = 0;
			empwage = emphours*wage_per_hour;
			totalempwage += empwage;
			System.out.println("Emp Wage: " + empwage);
		}
		System.out.println("Total Employee Wage :" +totalempwage);
		
	}

}

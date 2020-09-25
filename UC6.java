package EmployeeWageCode;

public class UC6 {
	static final int full_time = 1;
	static final int wage_per_hour = 20;
	static final int part_time = 2;
	static final int no_of_working_days = 20;
	static final int max_working_hours_inmonth = 100;
	
	public static void main(String[] args) {
		int emphours = 0;
		int totalemphours = 0;
		int totalempwage = 0;
		int totalworkingdays = 0;
		
		
		while (totalemphours <= max_working_hours_inmonth && totalworkingdays < no_of_working_days) {
			
			totalworkingdays ++;
		
			int empcheck = (int) Math.floor(Math.random()*10)%3;
		
			if (empcheck == full_time)
				emphours = 8;
			else if (empcheck == part_time)
				emphours = 8;
			else
				emphours = 0;
			
			totalemphours += emphours;
			System.out.println("Days: "+totalworkingdays +" Employee Hours: "+totalemphours);
		}
		
			totalempwage = totalemphours*wage_per_hour;
			System.out.println("Total Emp Wage: " + totalempwage);
		
	}

}

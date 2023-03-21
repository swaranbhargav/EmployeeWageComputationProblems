package com.bridgelabz.employeewagecomputationproblems;

public class EmployeeWageComputationProblems {
	public static final int IS_PART_TIME =1;
	public static final int IS_FULL_TIME =2;
	public static final int EMP_RATE_PER_HOUR =20;
	public static final int NUM_OF_WORKING_DAYS =20;
	public static final int MAX_HRS_IN_MONTH =160;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problems");
		
		
		 int empHrs = 0;
		 int totalEmpHrs = 0;
		 int totalWorkingDays = 0;
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS ) {
			totalWorkingDays++;
			int empCheck =(int) Math.floor(Math.random() * 10) % 3;
		    switch (empCheck) {
		    case IS_PART_TIME:
		    	empHrs =4 ;
		    	break;
		    case IS_FULL_TIME:
		    	empHrs = 8;
		    	break;
		    case 3 :
		    	empHrs = 0;
		    
		  }
		    totalEmpHrs = totalEmpHrs + empHrs;
		  
		    System.out.println("Total Days :" + totalWorkingDays + "employee Hrs" + empHrs);
		    	
		 }
		int totalEmpWages  = totalEmpHrs * EMP_RATE_PER_HOUR;
		 System.out.println("Total Employee Wages is :" + totalEmpWages);
	}
}

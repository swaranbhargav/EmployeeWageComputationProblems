package com.bridgelabz.employeewagecomputationproblems;

public class EmployeeWageComputationProblems {
	public static final int IS_PART_TIME =1;
	public static final int IS_FULL_TIME =2;
	public static final int EMP_RATE_PER_HOUR =20;
	public static final int NUM_OF_WORKING_DAYS =20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problems");
		
		
		 int empHrs = 0;
		 int empWage = 0;
		 int totalEmpWages = 0;
		 for (int day = 0; day <= NUM_OF_WORKING_DAYS; day++) {
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
		    empWage = empHrs * EMP_RATE_PER_HOUR;
		    totalEmpWages = totalEmpWages + empWage;
		    System.out.println("Employee Wages :" + empWage);
		    	
		    
		 }
		 System.out.println("Total Employee Wages is :" + totalEmpWages);
	}
}

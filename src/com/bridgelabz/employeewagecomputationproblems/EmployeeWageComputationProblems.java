package com.bridgelabz.employeewagecomputationproblems;

public class EmployeeWageComputationProblems {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problems");
		 int IS_FULL_TIME = 1;
		 int EMP_RATE_PER_HOUR = 20;
		 int empHrs = 0;
		 int empWage = 0;
		    double empCheck = Math.floor(Math.random() * 10) % 2;
		    if (empCheck == IS_FULL_TIME) {
		    	empHrs =8;
		    	System.out.println("The Employee Is Present");
		    	empWage=empHrs*EMP_RATE_PER_HOUR;
		    	System.out.println("Employee Wage is :" + empWage);
		    	
		    }else {
		    	empHrs=0;
		    	System.out.println("The Employee Is Absent");
		    	empWage=empHrs*EMP_RATE_PER_HOUR;
		    	System.out.println("Employee Wage is :" + empWage);
		    }
		    

	}

}

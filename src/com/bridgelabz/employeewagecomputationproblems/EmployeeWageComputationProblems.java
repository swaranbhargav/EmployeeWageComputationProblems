package com.bridgelabz.employeewagecomputationproblems;

public class EmployeeWageComputationProblems {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problems");
		 int IS_FULL_TIME = 1;
		    double empCheck = Math.floor(Math.random() * 10) % 2;
		    if (empCheck == IS_FULL_TIME) {
		    	System.out.println("The Employee Is Present");
		    	
		    }else {
		    	System.out.println("The Employee Is Absent");
		    }

	}

}

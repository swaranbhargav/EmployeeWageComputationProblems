package com.bridgelabz.employeewagecomputationproblems;

import java.util.Random;

public class EmployeeWageComputationProblems {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private static void wageComputation(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMont) {
		int empHrs = 0, totalWorkingDays = 0, totalEmpHrs = 0;
		Random random = new Random();
		while (totalEmpHrs < maxHoursPerMont && totalWorkingDays < numOfWorkingDays) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
			}
			totalEmpHrs = totalEmpHrs + empHrs;
		}

		int empWage = totalEmpHrs * empRatePerHour;
		System.out.println("Employee Wage for company " + company + " is : " + empWage);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		wageComputation("dMArt", 20, 2, 10);
		wageComputation("Reliance", 30, 4, 14);
	}
}

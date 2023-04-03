package com.bridgelabz.employeewagecomputationproblems;

import java.util.Random;

public class EmployeeWageComputationProblems {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	public EmployeeWageComputationProblems(String company, int empRatePerHour, int numOfWorkingDays,
			int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void computeEmpWage() {

		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day: " + totalWorkingDays + "working hours: " + empHrs);
		}
		totalEmpWage = totalEmpHrs * empRatePerHour;
	}

	@Override
	public String toString() {
		return "Total employee wage for " + company + " is " + totalEmpWage + "\n";
	}

	public static void main(String[] args) {
		System.out.println("\n" + "Employee wage program to save total employee wage for each company.\n");
		EmployeeWageComputationProblems dmart = new EmployeeWageComputationProblems("DMart", 20, 2, 10);
		EmployeeWageComputationProblems walmart = new EmployeeWageComputationProblems("Walmart", 10, 4, 20);
		dmart.computeEmpWage();
		System.out.println(dmart);
		walmart.computeEmpWage();
		System.out.println(walmart);
	}
}
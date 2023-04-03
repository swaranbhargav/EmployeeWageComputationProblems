package com.bridgelabz.employeewagecomputationproblems;

public class CompanyEmpWage {

	private final String companyName;
	private final int wagePerHour;
	private final int maxWorkingDays;
	private final int maxWorkingHours;
	private int totalWage;

	public CompanyEmpWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHours = maxWorkingHours;
		this.totalWage = 0;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	public String getCompanyName() {
		return companyName;
	}

	public int getWagePerHour() {
		return wagePerHour;
	}

	public int getMaxWorkingDays() {
		return maxWorkingDays;
	}

	public int getMaxWorkingHours() {
		return maxWorkingHours;
	}

	public int getTotalWage() {
		return totalWage;
	}

}

package com.bridgelabz.employeewagecomputationproblems;

public class CompanyEmpWage {
	public final String company;
	public final int empRatePerHours;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHours, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHours = empRatePerHours;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	

	public String getCompany() {
		return company;
	}


	public int getEmpRatePerHours() {
		return empRatePerHours;
	}


	public int getNumOfWorkingDays() {
		return numOfWorkingDays;
	}


	public int getMaxHoursPerMonth() {
		return maxHoursPerMonth;
	}


	public int getTotalEmpWage() {
		return totalEmpWage;
	}


	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "Total Employee Wage for Company:" + company + " is: " + totalEmpWage + "\n";
	}




		
	
}

package com.bridgelabz.employeewagecomputationproblems;

import java.util.ArrayList;

public class EmpWageBuilder {
	private final ArrayList<CompanyEmpWage> companyEmpWageList;

	public EmpWageBuilder() {
		companyEmpWageList = new ArrayList<>();
	}

	public void addCompanyEmpWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHour, maxWorkingDays, maxWorkingHours);
		companyEmpWageList.add(companyEmpWage);
	}

	public void calculateWage() {
		for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
			int totalWorkingHours = 0;
			int totalWorkingDays = 0;
			int dailyWage;
			while (totalWorkingDays < companyEmpWage.getMaxWorkingDays()
					&& totalWorkingHours < companyEmpWage.getMaxWorkingHours()) {
				totalWorkingDays++;
				int empCheck = (int) Math.floor(Math.random() * 10) % 3;
				switch (empCheck) {
				case 1:
					totalWorkingHours += 8;
					break;
				case 2:
					totalWorkingHours += 4;
					break;
				default:
					totalWorkingHours += 0;
					break;
				}
			}
			companyEmpWage.setTotalWage(totalWorkingHours * companyEmpWage.getWagePerHour());
			System.out.println(
					"Total wage for " + companyEmpWage.getCompanyName() + " is " + companyEmpWage.getTotalWage());
		}
	}

	public static void main(String[] args) {
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Wallmart", 10, 4, 20);
		empWageBuilder.calculateWage();
	}

}

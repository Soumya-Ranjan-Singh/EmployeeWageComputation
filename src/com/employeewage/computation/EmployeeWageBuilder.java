//Encapsulated Class

package com.employeewage.computation;

public class EmployeeWageBuilder implements ComputeEmployeeWage {

    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;


    //Define Default Constructor
    public EmployeeWageBuilder() {
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    //Adding company to an array
    public void addCompanyEmployeeWage(String companyName, int empWagePerHour, int maxWorkingHours, int maxWorkingDays)
    {
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(companyName, empWagePerHour, maxWorkingHours, maxWorkingDays);
        numOfCompany++;
    }

    //Computing employee wage and printing it
    public void computeEmpWage()
    {
        for (int i = 0; i < numOfCompany; i++)
        {
            companyEmpWageArray[i].setMonthlySalary(this.calculateTotalWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    //Calculating total wage
    public int calculateTotalWage(CompanyEmpWage companyEmpWage)
    {
        //Declaring variables
        int randomCheck;
        int salary = 0;
        int monthlySalary = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        System.out.println();
        System.out.println("For Company : "+companyEmpWage.companyName+"...................");
        while (totalWorkingHours < companyEmpWage.maxWorkingHours && totalWorkingDays < companyEmpWage.maxWorkingDays) {
            totalWorkingDays++;
            randomCheck = (int) Math.floor((Math.random() * 10) % 3);
            switch (randomCheck) {
                case 1:

                    System.out.println("Employee is working full-time");
                    salary = companyEmpWage.empWagePerHour * isFullTimeHour;
                    totalWorkingHours = totalWorkingHours + isFullTimeHour;
                    break;

                case 2:

                    System.out.println("Employee is working part-time");
                    salary = companyEmpWage.empWagePerHour * isPartTimeHour;
                    totalWorkingHours = totalWorkingHours + isPartTimeHour;
                    break;

                default:

                    System.out.println("Employee is absent");
                    salary = 0;
                    break;
            }

            System.out.print("Day: "+totalWorkingDays+"\t random : "+randomCheck+"\t");
            System.out.print("Working Hours: "+totalWorkingHours+"\t");
            System.out.print("Salary is: "+salary+"\t");
            System.out.println();
            monthlySalary = monthlySalary + salary;

        }
        return monthlySalary;
    }

}

//Encapsulated Class

package com.employeewage.computation;

public class EmployeeWageBuilder {

    //Declaring the constants
    private final static int isPartTimeHour = 4;
    private final static int isFullTimeHour = 8;

    //Declaring the object referred variables
    private final String companyName;
    private final int empWagePerHour;
    private final int maxWorkingHours;
    private final int maxWorkingDays;

    //Declaring some variables
    int randomCheck;
    int salary;
    int monthlySalary;
    int totalWorkingHours;
    int totalWorkingDays;

    //Define Parameterised Constructor
    public EmployeeWageBuilder(String companyName, int empWagePerHour, int workingHours, int workingDays) {
        this.companyName = companyName;
        this.empWagePerHour = empWagePerHour;
        this.maxWorkingHours = workingHours;
        this.maxWorkingDays = workingDays;
    }

    public void calculateTotalWage()
    {
        System.out.println();
        System.out.println("For Company : "+companyName+"...................");
        while (totalWorkingHours < maxWorkingHours && totalWorkingDays < maxWorkingDays) {
            totalWorkingDays++;
            randomCheck = (int) Math.floor((Math.random() * 10) % 3);
            switch (randomCheck) {
                case 1:

                    System.out.println("Employee is working full-time");
                    salary = empWagePerHour * isFullTimeHour;
                    totalWorkingHours = totalWorkingHours + isFullTimeHour;
                    break;

                case 2:

                    System.out.println("Employee is working part-time");
                    salary = empWagePerHour * isPartTimeHour;
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
    }

    public void print() {
        System.out.println();
        System.out.println("Total Wage of the Employee for Company : "+companyName+" is "+monthlySalary);
    }
}

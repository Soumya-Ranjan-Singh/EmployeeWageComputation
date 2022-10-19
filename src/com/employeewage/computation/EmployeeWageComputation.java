//This program is to display the welcome message to Employee wage computation program.
//Use Case-1 is to check whether the Employee is present or not.
//Use Case-2 is to calculate the daily Employee wage.
//Use Case-3 is to show part-time Employee's wage.
//Use Case-4 is to solve that previous program in switch case statement.
//Use Case-5 is to calculate wages for a month of an Employee.
//Use Case-6 is to calculate wages for a month of an Employee until a condition of total working hours or days is reached for a month.

package com.employeewage.computation;

public class EmployeeWageComputation {

    // Default Constructor
    public EmployeeWageComputation() {
        System.out.println("Welcome to Employee Wage Computation Program..!");
    }

    public static void main(String[] args) {

        //Initializing the constructor by creating the object of the class.
        EmployeeWageComputation employee = new EmployeeWageComputation();
        System.out.println();

        //Declaring the variables.
        final int isPartTime = 1;
        final int isFullTime = 2;
        int randomCheck;
        int empHour;
        int wagePerHour = 20;
        int salary = 0;
        int numWorkingDays = 20;
        int monthlySalary = 0;
        int maxHours = 100;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        /*Calculating the number of working days of an Employee randomly unless it satisfies the condition
          of total working hours or days is reached for a month.*/
        while (totalWorkingDays < numWorkingDays && totalWorkingHours < maxHours)
        {
            totalWorkingDays++;
            randomCheck = (int) Math.floor((Math.random() * 10) % 3);
            switch (randomCheck) {
                default :
                    System.out.println("Employee is absent");
                    empHour=0;
                    salary = empHour * wagePerHour;
                    break;
                case isPartTime :
                    System.out.println("Employee is working part-time");
                    int partTimeHour = 4;
                    empHour = partTimeHour;
                    salary = empHour * wagePerHour;
                    break;
                case isFullTime :
                    System.out.println("Employee is working full-time");
                    int fullTimeHour = 8;
                    empHour = fullTimeHour;
                    salary = empHour * wagePerHour;
                    break;
            }
            monthlySalary += salary;
            totalWorkingHours += empHour;
        }
        System.out.println();
        System.out.println("Total working days of an Employee is : "+totalWorkingDays+"\n");
        System.out.println("Total working hour of an Employee is : "+totalWorkingHours+"\n");
        System.out.println("Salary of an Employee in a month is : $"+monthlySalary);

    }
}

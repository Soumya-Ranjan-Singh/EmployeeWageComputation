//This program is to display the welcome message to Employee wage computation program.
//Use Case-1 is to check whether the Employee is present or not.
//Use Case-2 is to calculate the daily Employee wage.
//Use Case-3 is to show part-time Employee's wage.
//Use Case-4 is to solve that previous program in switch case statement.

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
        int randomCheck = (int) Math.floor((Math.random() * 10) % 3);
        int empHour;
        int wagePerHour = 20;
        int salary = 0;

        //Checking for part-time and full time by Switch case.
        switch (randomCheck) {
            default :
                System.out.println("Employee is absent");
                empHour=0;
                salary = empHour * wagePerHour;
                System.out.println("Salary is: $"+salary);
                break;
            case isFullTime :
                System.out.println("Employee is working part-time");
                int partTimeHour = 4;
                empHour = partTimeHour;
                salary = empHour * wagePerHour;
                System.out.println("Salary is: $"+salary);
                break;
            case isPartTime :
                System.out.println("Employee is working full-time");
                int fullTimeHour = 8;
                empHour = fullTimeHour;
                salary = empHour * wagePerHour;
                System.out.println("Salary is: $"+salary);
                break;
        }

    }
}

//This program is to display the welcome message to Employee wage computation program.
//Use Case-1 is to check whether the Employee is present or not.
//Use Case-2 is to calculate the daily Employee wage.
//Use Case-3 is to show part-time Employee's wage.
//Use Case-4 is to solve that previous program in switch case statement.
//Use Case-5 is to calculate wages for a month of an Employee.
//Use Case-6 is to calculate wages for a month of an Employee until a condition of total working hours or days is reached for a month.
//Use Case-7 is to refactor the above use case to write class method to compute Employee Wage.
//Use Case-8 is to compute Employee Wage for multiple companies.
//Use Case-9 is to create EmployeeWageBuilder for each company.
//Use Case-10 is to manage Employee Wage of multiple companies.

package com.employeewage.computation;

public class EmployeeWageComputation {

    // Default Constructor
    public EmployeeWageComputation()
    {
        System.out.println("Welcome to Employee Wage Computation Program..!");
    }

    public static void main(String[] args) {

        //Initializing the constructor by creating the object of the class.
        EmployeeWageComputation employee = new EmployeeWageComputation();

        //Calculating employee wage for different companies.
        System.out.println("Calculating the salary for different companies : ............");
        EmployeeWageBuilder employeeWageBuilder = new EmployeeWageBuilder();
        employeeWageBuilder.addCompanyEmployeeWage("Google",40,100,20);
        employeeWageBuilder.addCompanyEmployeeWage("Microsoft",20,150,18);
        employeeWageBuilder.addCompanyEmployeeWage("Amazon",60,180,22);
        employeeWageBuilder.addCompanyEmployeeWage("Apple",30,190,26);
        employeeWageBuilder.computeEmpWage();

    }

}

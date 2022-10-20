//This program is to display the welcome message to Employee wage computation program.
//Use Case-1 is to check whether the Employee is present or not.
//Use Case-2 is to calculate the daily Employee wage.
//Use Case-3 is to show part-time Employee's wage.
//Use Case-4 is to solve that previous program in switch case statement.
//Use Case-5 is to calculate wages for a month of an Employee.
//Use Case-6 is to calculate wages for a month of an Employee until a condition of total working hours or days is reached for a month.
//Use Case-7 is to refactor the above use case to write class method to compute Employee Wage.

package com.employeewage.computation;

public class EmployeeWageComputation {

    //Declaring the constants
    private final int isPartTime = 1;
    private final int isFullTime = 2;
    private final int wagePerHour = 20;
    private final int numWorkingDays = 20;
    private final int maxHours = 100;

    // Default Constructor
    public EmployeeWageComputation() {
        System.out.println("Welcome to Employee Wage Computation Program..!");
    }

    @Override
    public String toString() {
        return "EmployeeWageComputation{" +
                "isPartTime=" + isPartTime +
                ", isFullTime=" + isFullTime +
                ", wagePerHour=" + wagePerHour +
                ", numWorkingDays=" + numWorkingDays +
                ", maxHours=" + maxHours +
                '}';
    }

    public static void main(String[] args) {

        //Initializing the constructor by creating the object of the class.
        EmployeeWageComputation employee = new EmployeeWageComputation();
        System.out.println("Constants Taken for the computation program are below :\n"+employee);
        System.out.println();
        System.out.println("Calculating the salary : ............");
        printData(calculateSalary(employee)); //Parsing value from calculateSalary Method.

    }

    /*Calculating the number of working days of an Employee randomly unless it satisfies the condition
          of total working hours or days is reached for a month.*/
    public static int[] calculateSalary(EmployeeWageComputation employee) {

        //Declaring the variables
        int randomCheck;
        int empHour;
        int salary;
        int monthlySalary = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while (totalWorkingDays < employee.numWorkingDays && totalWorkingHours < employee.maxHours)
        {
            totalWorkingDays++;
            randomCheck = (int) Math.floor((Math.random() * 10) % 3);
            if (randomCheck == 0)
            {
                System.out.println("Employee is absent");
                empHour = 0;
                salary = empHour * employee.wagePerHour;
            }
            else if (randomCheck == employee.isPartTime)
            {

                System.out.println("Employee is working part-time");
                int partTimeHour = 4;
                empHour = partTimeHour;
                salary = empHour * employee.wagePerHour;
            }
            else
            {
                System.out.println("Employee is working full-time");
                int fullTimeHour = 8;
                empHour = fullTimeHour;
                salary = empHour * employee.wagePerHour;
            }
            monthlySalary += salary;
            totalWorkingHours += empHour;
        }
        int[] employeeData = {monthlySalary, totalWorkingDays, totalWorkingHours};
        return employeeData;
    }

    //Printing the data
    public static void printData(int[] calculateSalary) {
        int monthlySalary = calculateSalary[0];
        int totalWorkingDays = calculateSalary[1];
        int totalWorkingHours = calculateSalary[2];
        System.out.println();
        System.out.println("Total working days of an Employee is : "+totalWorkingDays+"\n");
        System.out.println("Total working hour of an Employee is : "+totalWorkingHours+"\n");
        System.out.println("Salary of an Employee in a month is : $"+monthlySalary);
    }
}

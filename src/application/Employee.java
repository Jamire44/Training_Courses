package application;

/**
 * File name: Employee.java
 * Author: Jamie Doyle
 * Student number: D24125998
 * Description: Handles employee details and validations.
 */

public class Employee {

    private int employeeNumber;
    private String name;
    private int nOOfYearsExp;
    private String courseName;

    public Employee(int employeeNumber, String name, int nOOfYearsExp, String courseName) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.nOOfYearsExp = nOOfYearsExp;
        this.setCourseName(courseName);
        if (this.nOOfYearsExp < 5){
            System.out.println("Only Employees with over 5 years of experience are allowed on training courses.");
        }
    }

    public Employee(){
        this.name = "";
        this.employeeNumber = 0;
        this.nOOfYearsExp = 0;
        this.courseName = "ERROR";
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfYearsExp() {
        return nOOfYearsExp;
    }

    public void setNoOfYearsExp(int nOOfYearsExp) {
        this.nOOfYearsExp = nOOfYearsExp;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (courseName.length() >= 4 && courseName.substring(0,4).equals("FOOD")) {
            this.courseName = courseName;
        } else {
            this.courseName = "ERROR";
            System.out.println("Invalid course name.");
        }
    }

    public boolean isSame(Employee otherEmployee){
        return this.employeeNumber == otherEmployee.getEmployeeNumber();
    }

    @Override
    public String toString() {
        return "Employee Number: " + employeeNumber +
                "Name: '" + name + '\'' +
                "Number Of Years Experience: " + nOOfYearsExp +
                "Course Name: " + courseName + '\'';
    }
}

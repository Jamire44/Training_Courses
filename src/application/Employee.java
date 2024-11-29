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
        this.courseName = courseName;
    }

    public Employee(){}

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

    public int getnOOfYearsExp() {
        return nOOfYearsExp;
    }

    public void setnOOfYearsExp(int nOOfYearsExp) {
        this.nOOfYearsExp = nOOfYearsExp;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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

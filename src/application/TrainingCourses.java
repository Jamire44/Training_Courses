package application;

import application.Employee;
import util.LinkedList;

import java.util.Scanner;

/**
 * File name: TrainingCourses.java
 * Author: [Your Name]
 * Student number: [Your Student Number]
 * Description: Driver class for managing training courses and employee registrations.
 */
public class TrainingCourses {
    public static void main(String[] args) {
        LinkedList<Employee> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of employees you wish to add (up to 10): ");
        int numberOfEmployees = scanner.nextInt();

        // Limit the number of employees to 10
        if (numberOfEmployees > 10) {
            System.out.println("Limiting the number of employees to 10.");
            numberOfEmployees = 10;
        }

        // Add employees
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter details for employee #" + (i + 1));
            System.out.print("Employee Number: ");
            int empNum = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Years Working: ");
            int years = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over
            System.out.print("Training Course Name: ");
            String courseName = scanner.nextLine();

            Employee emp = new Employee(empNum, name, years, courseName);
            list.add(emp);
        }

        // Display all employee details
        System.out.println("\nAll Employee Details:");
        list.display();

        // Remove an employee
        System.out.print("Enter the employee number to remove: ");
        int removeEmpNumber = scanner.nextInt();
        list.removeByEmployeeNumber(removeEmpNumber);

        // Display all after removal
        System.out.println("\nEmployee Details after Removal:");
        list.display();

        // Remove all employees from a specified course
        System.out.print("Enter a course name to remove all employees from it: ");
        scanner.nextLine();  // Consume newline left-over
        String courseToRemove = scanner.nextLine();
        list.removeAllFromCourse(courseToRemove);

        // Display remaining employees
        System.out.println("\nRemaining Employees:");
        list.display();

        scanner.close();
    }
}

package za.ac.cput.domain;
/*  Employee.java
    Employee model class
    Author: Asimbonge Mbende (22222222)
    Date: 19 March 2025
* */

import java.util.Objects;

public class Employee {
    // Instance variables (fields) of the Employee class
    private String employeeId;
    private String employeeFullName;
    private String employeeEmailAddress;

    // Protected constructor to prevent direct instantiation from outside the class
    //The protected modifier specifies that the member can only be accessed within its own package
    protected Employee() {
    }

    // Private constructor used by the Builder class to instantiate Employee objects
    private Employee(Builder builder) {
        this.employeeId = builder.employeeId;
        this.employeeFullName = builder.employeeFullName;
        this.employeeEmailAddress = builder.employeeEmailAddress;
    }

    // Getter method to retrieve the employee ID
    public String getEmployeeId() {
        return employeeId;
    }

    // Getter method to retrieve the employee's full name
    public String getEmployeeFullName() {
        return employeeFullName;
    }

    // Getter method to retrieve the employee's email address
    public String getEmployeeEmailAddress() {
        return employeeEmailAddress;
    }

    // Override the equals() method to compare two Employee objects
    @Override
    public boolean equals(Object o) {
        // Return false if the object is null or not of the same class
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        // Return true if the employeeId, employeeFullName, and employeeEmailAddress are equal
        return Objects.equals(employeeId, employee.employeeId) &&
                Objects.equals(employeeFullName, employee.employeeFullName) &&
                Objects.equals(employeeEmailAddress, employee.employeeEmailAddress);
    }

    // Override the hashCode() method to generate a hash code for the Employee object
    @Override
    public int hashCode() {
        // Return a hash code based on employeeId, employeeFullName, and employeeEmailAddress
        return Objects.hash(employeeId, employeeFullName, employeeEmailAddress);
    }

    // Override the toString() method to provide a string representation of the Employee object
    @Override
    public String toString() {
        // Return a formatted string with each property on a new line
        return String.format("Employee Details:%n" +
                "EmployeeID:'%s',%n" +
                "Full Name:'%s',%n" +
                "Email Address:'%s'%n", employeeId, employeeFullName, employeeEmailAddress);
    }


    // Static nested Builder class to follow the Builder design pattern
    public static class Builder {
        // Instance variables (fields) for the Builder class to hold the data
        private String employeeId;
        private String employeeFullName;
        private String employeeEmailAddress;

        // Setter method for employeeId, returns the Builder instance for method chaining
        public Builder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        // Setter method for employeeFullName, returns the Builder instance for method chaining
        public Builder setEmployeeFullName(String employeeFullName) {
            this.employeeFullName = employeeFullName;
            return this;
        }

        // Setter method for employeeEmailAddress, returns the Builder instance for method chaining
        public Builder setEmployeeEmailAddress(String employeeEmailAddress) {
            this.employeeEmailAddress = employeeEmailAddress;
            return this;
        }

        // Copy method to create a new Builder instance based on an existing Employee object
        // This allows for easy copying of an Employee's state into a new Builder
        // For example, you might want to copy an existing employee's details and
        // change just one field (like their email) without rewriting all the information.
        public Builder copy(Employee employee) {
            this.employeeId = employee.employeeId;
            this.employeeFullName = employee.employeeFullName;
            this.employeeEmailAddress = employee.employeeEmailAddress;
            return this;
        }

        // Build method to create an instance of Employee using the Builder's data
        public Employee build() {
            return new Employee(this);  // Pass the builder to the Employee constructor
        }
    }
}

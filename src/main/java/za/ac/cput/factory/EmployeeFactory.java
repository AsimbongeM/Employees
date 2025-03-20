package za.ac.cput.factory;

import za.ac.cput.domain.Employee;
import za.ac.cput.util.Helper;

public class EmployeeFactory {
    public static Employee createEmployee(String fullName, String emailAddress) {
        String employeeId = Helper.generateId();

        if (Helper.isNullOrEmpty(fullName) || !Helper.isValidEmail(emailAddress) || Helper.isNullOrEmpty(emailAddress)) {
            return null; // Return null if any of the conditions are true
        }
        return new Employee.Builder()
                .setEmployeeId(employeeId)
                .setEmployeeFullName(fullName)
                .setEmployeeEmailAddress(emailAddress)
                .build();
    }
}

package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Employee;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeFactoryTest {
    @Test
    @Order(1)
    void createEmployee() {
        Employee employee = EmployeeFactory.createEmployee("Asimbonge Mbende", "mbende@gmail.com");

        assertNotNull(employee);  // Check if employee is created
        assertNotNull(employee.getEmployeeId());  // Check if employee ID is generated
        assertEquals("Asimbonge Mbende", employee.getEmployeeFullName());  // Verify full name
        assertEquals("mbende@gmail.com", employee.getEmployeeEmailAddress());  // Verify email address
        System.out.print(employee);
    }


    @Test
    @Order(2)
    void createEmployeeInvalidEmail() {
        // Invalid email case
        Employee employee = EmployeeFactory.createEmployee("Asimbonge Mbende", "mbende@gmailcom");


        assertNull(employee);  // Should return null since the email is invalid
        System.out.print(employee);
    }

    @Test
    @Order(3)
    void createEmployeeNullValues() {
        // Null full name case
        Employee employee = EmployeeFactory.createEmployee(null, "mbende@gmail.com");

        assertNull(employee);  // Should return null since the full name is null
        System.out.print(employee);
    }


}

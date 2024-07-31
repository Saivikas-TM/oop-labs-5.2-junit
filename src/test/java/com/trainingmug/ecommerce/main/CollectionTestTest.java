package com.trainingmug.ecommerce.main;

import com.trainingmug.ecommerce.domain.Employee;
import com.trainingmug.ecommerce.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionTestTest {
    private EmployeeRepository employeeRepository;
    private List<Employee> employeeList;

    @BeforeEach
    void setUp() {
        // Initializing the EmployeeRepository before each test
        employeeRepository = new EmployeeRepository();
        employeeList = employeeRepository.getEmployeeList();
    }

    @Test
    @Order(1)
    @DisplayName("Check if getEmployeeList() is created and returns the correct list")
    void testGetEmployeeList() {
        // Verifying that the employeeList is not null
        assertNotNull(employeeList, "Employee list should not be null");

        // Verifying that the employeeList size matches the expected number of employees
        assertEquals(7, employeeList.size(), "Employee list size should be 7");

        // Optionally, you can verify specific employee details
        Employee firstEmployee = employeeList.get(0);
        assertEquals(3333, firstEmployee.getEmpId(), "First employee ID should be 3333");
        assertEquals("Nancy Davolio", firstEmployee.getName(), "First employee name should be Nancy Davolio");
    }
}

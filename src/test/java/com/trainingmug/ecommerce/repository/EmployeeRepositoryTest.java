package com.trainingmug.ecommerce.repository;


import com.trainingmug.ecommerce.domain.Designer;
import com.trainingmug.ecommerce.domain.Developer;
import com.trainingmug.ecommerce.domain.Employee;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmployeeRepositoryTest {

    @Test
    @Order(1)
    @DisplayName("1. Check if List<Employee> employeeList is declared")
    void checkEmployeeListDeclared() {
        try {
            EmployeeRepository.class.getDeclaredField("employeeList");
        } catch (NoSuchFieldException e) {
            fail("Field employeeList is not declared");
        }
    }

    @Test
    @Order(2)
    @DisplayName("2. Check if employeeList is initialized to ArrayList in no-arg constructor")
    void checkEmployeeListInitialized() {
        EmployeeRepository repository = new EmployeeRepository();
        assertNotNull(repository.getEmployeeList(), "employeeList is not initialized");
        assertTrue(repository.getEmployeeList() instanceof ArrayList, "employeeList is not an instance of ArrayList");
    }

    @Test
    @Order(3)
    @DisplayName("3. Check if all Employee, Developer, Designer objects are added to employeeList")
    void checkAllObjectsAddedToEmployeeList() {
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employeeList = repository.getEmployeeList();

        assertEquals(7, employeeList.size(), "Not all Employee objects are added to employeeList");

        // Check if specific instances are added correctly
        assertTrue(employeeList.contains(new Employee(3333, "Nancy Davolio", "Devops Engineer", 4569.45F, 280.5F, 535.45F, 326.34F, 12.5F, "00343538343")), "Nancy Davolio not found in employeeList");
        assertTrue(employeeList.contains(new Developer(5555, "David Austin", "Senior Backend Developer", 6579.45F, 332.5F, 629.45F, 398.34F, 9.5F, "01642558343", 5)), "David Austin not found in employeeList");
        assertTrue(employeeList.contains(new Designer(7777, "Daniel Faviet", "Senior UI/UX Designer", 6349.45F, 322.5F, 618.45F, 387.34F, 8.5F, "01642568343", 5)), "Daniel Faviet not found in employeeList");
    }

    @Test
    @Order(4)
    @DisplayName("4. Check if duplicate Employee/Developer/Designer objects are added to employeeList")
    void checkDuplicateObjectsAddedToEmployeeList() {
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employeeList = repository.getEmployeeList();

        long duplicateCount = employeeList.stream()
                .filter(emp -> emp.equals(new Designer(8888, "Daniel Faviet", "Junior UI/UX Designer", 4339.45F, 277.5F, 526.45F, 316.34F, 12.8F, "01243657343", 3)))
                .count();

        assertTrue(duplicateCount > 1, "Duplicate Designer objects not found in employeeList");
    }

//    @Test
//    @Order(5)
//    @DisplayName("5. Check if getEmployeeList() returns List<Employee>")
//    void checkGetEmployeeListMethod() {
//        EmployeeRepository repository = new EmployeeRepository();
//        List<Employee> employeeList = repository.getEmployeeList();
//
//        assertNotNull(employeeList, "getEmployeeList() returned null");
//        assertTrue(employeeList instanceof List, "getEmployeeList() did not return a List");
//    }



}

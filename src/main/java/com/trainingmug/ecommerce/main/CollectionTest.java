package com.trainingmug.ecommerce.main;

import com.trainingmug.ecommerce.domain.Employee;
import com.trainingmug.ecommerce.repository.EmployeeRepository;
import com.trainingmug.ecommerce.service.PayrollImpl;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionTest {

    public static void main(String[] args) {

        EmployeeRepository empRepository = new EmployeeRepository();
        Set<Employee> employeeSet = empRepository.getEmployeeSet();
        //Print the empoyee count
        //System.out.println("No of Employees : " + employeeSet.size());

        PayrollImpl payroll = new PayrollImpl();

        /*
         * Iterator<Employee> iterator = employeeSet.iterator();
         * while(iterator.hasNext()) { payroll.displayProfile(iterator.next()); }
         */

        List<Employee> employeeList = empRepository.getEmployeeList();
        System.out.println("No of Employees : " + employeeList.size());

        Iterator<Employee> iterator = employeeList.iterator();

        while(iterator.hasNext()) { payroll.displayProfile(iterator.next()); }
    }

}
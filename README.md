# Module 5: Collections and Generics

## Objective
The objective of this module is to get hands-on experience with the following topics:
1. Introduction to Collection Framework
2. Working with Set
3. Working with List
4. Working with Map
5. Working with Generics

   
# Lab 5.2

## Objectives
1. Understand and implement `List` in Java.

## Problem Statement
Create a `List` of `Employees` and iterate through the list.

### Tasks
1. **Create the following property** under the `EmployeeRepository` class:
    ```java
    List<Employee> employeeList;
    ```

2. **Inside the no-argument constructor**, perform the following steps:
   - Initialize `employeeList` to `ArrayList`.
   - Add all `Employee` objects, `Developer` objects, and `Designer` objects to `employeeList`.
   - Add one duplicate `Employee`/`Developer`/`Designer` object to `employeeList`.

3. **Create the following method** in `EmployeeRepository` that returns the `List<Employee>`:
    ```java
    public List<Employee> getEmployeeList()
    ```

4. **In the `CollectionTest` class**, get the `Employee` list by calling `getEmployeeList()` method.

5. **Print the total number of employees**.

6. **Run the `CollectionTest` class** and observe that it will print "No of Employees: 7" even though one duplicate object was added. 
   - *Note: `ArrayList` allows duplicates, which is why you will get "No of Employees: 7" even though you have implemented `hashCode()` and `equals()`.*

7. **Iterate through `employeeList`** and display each `Employee` profile by calling `displayProfile(Employee)` on the `PayrollImpl` object.

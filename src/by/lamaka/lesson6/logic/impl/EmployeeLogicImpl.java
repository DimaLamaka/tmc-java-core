package by.lamaka.lesson6.logic.impl;

import by.lamaka.lesson6.entity.Director;
import by.lamaka.lesson6.entity.Employee;
import by.lamaka.lesson6.logic.EmployeeLogic;

import java.util.Arrays;

public class EmployeeLogicImpl implements EmployeeLogic {
    @Override
    public Employee searchEmployee(Director director, String name, String surname) {
        for (Employee emp : director.getEmployees()) {
            if (emp.getName().equals(name) && emp.getSurname().equals(surname)) {
                return emp;
            }
        }
        return null;
    }

    @Override
    public Employee searchEmployeeImprove(Director director, String name, String surname) {
        if (director.getEmployees().length == 0) {
            return null;
        }
        for (Employee emp : director.getEmployees()) {
            if (emp.getName().equals(name) && emp.getSurname().equals(surname)) {
                System.out.println("Found!!! His director: " + director.getName()+" " + director.getSurname());
                return emp;
            }
            if (emp instanceof Director) {
                return searchEmployeeImprove((Director) emp, name, surname);
            }
        }
        return null;
    }

    @Override
    public boolean addEmployee(Director director, Employee employee) {
        if (director != null && employee != null) {
            Employee[] employees = director.getEmployees();
            employees = Arrays.copyOf(employees, employees.length + 1);
            employees[employees.length - 1] = employee;
            director.setEmployees(employees);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeEmployee(Director director, String name, String surname) {
        if (director != null) {
            Employee[] employees = director.getEmployees();
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getName().equals(name) && employees[i].getSurname().equals(surname)) {
                    Employee tempEmp = employees[i];
                    employees[i] = employees[employees.length - 1];
                    employees[employees.length - 1] = tempEmp;
                    employees = Arrays.copyOf(employees, employees.length - 1);
                    director.setEmployees(employees);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public double calculateSalary(Employee employee) {
        if (employee == null) {
            return 0;
        }
        double salary = employee.getDEFAULT_RATE() * employee.getPost().getPayRate() * employee.getWorkExperience();
        if (employee instanceof Director) {
            salary += ((Director) employee).getEmployees().length * 5000;
        }
        return salary;
    }

}

package by.lamaka.lesson6.logic;

import by.lamaka.lesson6.entity.Director;
import by.lamaka.lesson6.entity.Employee;

public interface EmployeeLogic {
    Employee searchEmployee(Director director, String name, String surname);

    Employee searchEmployeeImprove(Director director, String name, String surname);

    boolean addEmployee(Director director, Employee employee);

    boolean removeEmployee(Director director,String name, String surname);

    double calculateSalary(Employee employee);
}

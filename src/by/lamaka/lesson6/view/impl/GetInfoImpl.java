package by.lamaka.lesson6.view.impl;

import by.lamaka.lesson6.entity.Director;
import by.lamaka.lesson6.entity.Employee;
import by.lamaka.lesson6.logic.EmployeeLogic;
import by.lamaka.lesson6.logic.impl.EmployeeLogicImpl;
import by.lamaka.lesson6.view.GetInfo;

public class GetInfoImpl implements GetInfo {
    private static final EmployeeLogic EMPLOYEE_LOGIC = new EmployeeLogicImpl();

    @Override
    public String getInfoEmp(Employee employee) {
        String info = "Post: " + employee.getPost() + " | Name: " + employee.getName() + " | Surname: " + employee.getSurname() +
                " | Work experience: " + employee.getWorkExperience() + " | Salary " + EMPLOYEE_LOGIC.calculateSalary(employee) + " $";
        if (employee instanceof Director) {
            info += "\nEmployees: {";
            for (Employee emp : ((Director) employee).getEmployees()) {
                info += "{" + getInfoEmp(emp) + "}";
            }
            info+="}";
        }
        return info;
    }
}

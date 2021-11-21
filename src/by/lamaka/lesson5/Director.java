package by.lamaka.lesson5;

import java.util.Arrays;

public class Director extends Employee {
    private Employee[] employees;

    {
        employees = new Employee[1];
    }

    public Director() {
    }

    public Director(String name, String surname,  double workExperience) {
        super(name, surname, workExperience);
        this.setPost(this.getPost());
    }

    public boolean addWorker(Employee employee) {
        if (employees[employees.length - 1] != null) {
            employees = Arrays.copyOf(employees, employees.length + 1);
        }
        employees[employees.length - 1] = employee;
        return true;
    }

    public double calculateSalary() {
        return super.calculateSalary() + (employees.length * 5000);
    }

    public POSTS getPost() {
        return POSTS.DIRECTOR;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Director{" + super.toString() + "} " +
                " Employees=" + Arrays.toString(employees);
    }
}

package by.lamaka.lesson6.entity;

import java.util.Arrays;

public class Director extends Employee {
    private Employee[] employees;

    {
        employees = new Employee[0];
    }

    public Director() {
    }

    public Director(String name, String surname,  double workExperience) {
        super(name, surname, workExperience);
        this.setPost(this.getPost());
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
        return "Director{" +
                "employees=" + Arrays.toString(employees) +
                "} " + super.toString();
    }
}

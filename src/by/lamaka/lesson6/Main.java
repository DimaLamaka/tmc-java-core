package by.lamaka.lesson6;

import by.lamaka.lesson6.entity.Director;
import by.lamaka.lesson6.entity.Employee;
import by.lamaka.lesson6.entity.Worker;
import by.lamaka.lesson6.logic.EmployeeLogic;
import by.lamaka.lesson6.logic.impl.EmployeeLogicImpl;
import by.lamaka.lesson6.view.GetInfo;
import by.lamaka.lesson6.view.impl.GetInfoImpl;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Employee worker = new Worker("Ivan", "Ivanov", 2);
        Employee worker1 = new Worker("Egor", "Egorov", 1);
        Employee worker2 = new Worker("Petya", "Petrov", 2.5);
        Employee director = new Director("Ira", "Sidorova", 4);

        EmployeeLogic employeeLogic = new EmployeeLogicImpl();
        GetInfo getInfo = new GetInfoImpl();
        System.out.println(getInfo.getInfoEmp(worker));
        System.out.println(getInfo.getInfoEmp(worker1));
        System.out.println(getInfo.getInfoEmp(worker2));
        System.out.println(getInfo.getInfoEmp(director));


        if (director instanceof Director) {
            employeeLogic.addEmployee((Director) director, worker);
            employeeLogic.addEmployee((Director) director, worker1);
        }
        System.out.println(getInfo.getInfoEmp(director));
        System.out.println("Remove Egor egorov");
        employeeLogic.removeEmployee((Director) director, "Egor", "Egorov");
        System.out.println(getInfo.getInfoEmp(director));

        Employee director1 = new Director("Jenya", "Mir", 5.5);
        if (director1 instanceof Director) {
            employeeLogic.addEmployee((Director) director1, worker2);
        }
        System.out.println(getInfo.getInfoEmp(director1));

        if (director instanceof Director) {
            employeeLogic.addEmployee((Director) director, director1);
        }
        System.out.println(getInfo.getInfoEmp(director));

        System.out.println("find by default search: Petya Petrov");
        Optional<Employee> emp1 = Optional.ofNullable(employeeLogic.searchEmployee((Director) director, "Petya", "Petrov"));
        emp1.ifPresent(employee -> System.out.println(getInfo.getInfoEmp(employee)));

        System.out.println("find by improved search: Petya Petrov");
        Optional<Employee> emp = Optional.ofNullable(employeeLogic.searchEmployeeImprove((Director) director, "Petya", "Petrov"));
        emp.ifPresent(employee -> System.out.println(getInfo.getInfoEmp(employee)));

    }
}

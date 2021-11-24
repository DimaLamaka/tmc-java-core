package by.lamaka.lesson7.main;

import by.lamaka.lesson7.service.ApplicationService;
import by.lamaka.lesson7.service.impl.ApplicationServiceImpl;

public class Main {
    public static void main(String[] args) {
        ApplicationService applicationService = new ApplicationServiceImpl();
        applicationService.startApplication();
    }
}

package by.lamaka.lesson7.service.impl;

import by.lamaka.lesson7.dao.UserInputDAO;
import by.lamaka.lesson7.dao.impl.UserInputDAOImpl;
import by.lamaka.lesson7.exception.MemoryOverflowException;
import by.lamaka.lesson7.exception.QueueIsEmptyException;
import by.lamaka.lesson7.exception.ValidateException;
import by.lamaka.lesson7.service.ApplicationService;
import by.lamaka.lesson7.service.ValidateUserInputService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplicationServiceImpl implements ApplicationService {
    public static final ValidateUserInputService validateUserInputService = new ValidateUserInputServiceImpl();
    public static final UserInputDAO USER_INPUT_DAO = new UserInputDAOImpl();

    @Override
    public void startApplication() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String nextLine = "";
        do {
            try {
                nextLine = bufferedReader.readLine();
                if ("get".equalsIgnoreCase(nextLine)) {
                    System.out.println(USER_INPUT_DAO.getAndRemoveUserInput() + " was deleted");
                } else {
                    if (validateUserInputService.validateUserInput(nextLine)) {
                        USER_INPUT_DAO.addUserInput(nextLine);
                    }
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (QueueIsEmptyException | ValidateException | MemoryOverflowException e) {
                System.out.println(e.getMessage());
            }
        } while (!"exit".equalsIgnoreCase(nextLine));
    }
}

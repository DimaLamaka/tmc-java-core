package by.lamaka.lesson7.service;

import by.lamaka.lesson7.exception.ValidateException;

public interface ValidateUserInputService {
    boolean validateUserInput(String userText) throws ValidateException;
}

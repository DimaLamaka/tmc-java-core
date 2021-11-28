package by.lamaka.lesson7.service.impl;

import by.lamaka.lesson7.exception.ValidateException;
import by.lamaka.lesson7.service.ValidateUserInputService;

public class ValidateUserInputServiceImpl implements ValidateUserInputService {
    public static final String MY_REGEX = "[A-Za-z]+";

    @Override
    public boolean validateUserInput(String userText) throws ValidateException {
        if (!userText.matches(MY_REGEX)) {
            throw new ValidateException("\"" + userText + "\" cannot be saved");
        }
        return true;
    }
}

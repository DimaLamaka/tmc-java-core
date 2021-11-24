package by.lamaka.lesson7.dao;

import by.lamaka.lesson7.exception.MemoryOverflowException;
import by.lamaka.lesson7.exception.QueueIsEmptyException;

public interface UserInputDAO {
    boolean addUserInput(String userInput) throws MemoryOverflowException;
    String getAndRemoveUserInput() throws QueueIsEmptyException;
}

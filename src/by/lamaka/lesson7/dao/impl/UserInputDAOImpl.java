package by.lamaka.lesson7.dao.impl;

import by.lamaka.lesson7.dao.UserInputDAO;
import by.lamaka.lesson7.entity.MyDB;
import by.lamaka.lesson7.exception.MemoryOverflowException;
import by.lamaka.lesson7.exception.QueueIsEmptyException;

public class UserInputDAOImpl implements UserInputDAO {
    public static final MyDB MY_DB = new MyDB();

    @Override
    public boolean addUserInput(String userInput) throws MemoryOverflowException {
        if (MY_DB.getStrings().size() >= 5) {
            throw new MemoryOverflowException("Max size is: 5");
        }
        return MY_DB.getStrings().add(userInput);
    }

    @Override
    public String getAndRemoveUserInput() throws QueueIsEmptyException {
        if (MY_DB.getStrings().isEmpty()) {
            throw new QueueIsEmptyException("Queue is empty");
        }
        return MY_DB.getStrings().poll();
    }

    public void print() {
        MY_DB.getStrings().stream().forEach(s -> System.out.println(s));
    }
}

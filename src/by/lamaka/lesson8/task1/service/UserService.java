package by.lamaka.lesson8.task1.service;

import by.lamaka.lesson8.task1.SEX;
import by.lamaka.lesson8.task1.User;

import java.util.Collection;


public interface UserService {
    Collection<User> findUserByName(Collection<User> userList, String name);
    Collection<User> findUserBySex(Collection<User> userList, SEX sex);
    Collection<User> sortUserListByAge(Collection<User> userList);
}

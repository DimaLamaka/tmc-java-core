package by.lamaka.lesson8.task1.service;

import by.lamaka.lesson8.task1.SEX;
import by.lamaka.lesson8.task1.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class UserServiceImpl implements UserService {
    @Override
    public Collection<User> findUserByName(Collection<User> userList, String name) {
        Collection<User> result = new ArrayList<>();
        for (User user : userList) {
            if (user.getName().equals(name)) {
                result.add(user);
            }
        }
        //result = userList.stream().filter(o-> name.equals(o.getName())).collect(Collectors.toList());
        return result;
    }

    @Override
    public Collection<User> findUserBySex(Collection<User> userList, SEX sex) {
        Collection<User> result = new ArrayList<>();
        for (User user : userList) {
            if (user.getSex().equals(sex)) {
                result.add(user);
            }
        }
        //result = userList.stream().filter(o-> sex.equals(o.getSex())).collect(Collectors.toList());
        return result;
    }

    @Override
    public Collection<User> sortUserListByAge(Collection<User> userList) {
        return new TreeSet<>(userList);
    }
}

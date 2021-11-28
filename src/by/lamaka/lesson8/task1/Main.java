package by.lamaka.lesson8.task1;

import by.lamaka.lesson8.task1.service.UserService;
import by.lamaka.lesson8.task1.service.UserServiceImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user = new User("Petya", 16, SEX.MALE);
        User user1 = new User("Katya", 17, SEX.FEMALE);
        User user2 = new User("Alexey", 16, SEX.MALE);
        User user3 = new User("Petya", 18, SEX.MALE);
        UserService userService = new UserServiceImpl();

        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        System.out.println("ArrayList: ");
        System.out.println(userService.findUserByName(userList, "Petya"));
        System.out.println(userService.findUserBySex(userList, SEX.FEMALE));
        System.out.println(userService.sortUserListByAge(userList));

        Set<User> userSet = new HashSet<>(userList);
        System.out.println("Hashset: ");
        System.out.println(userService.findUserByName(userSet, "Alexey"));
        System.out.println(userService.findUserBySex(userSet, SEX.MALE));
        System.out.println(userService.sortUserListByAge(userSet));

        List<User> userList2 = new LinkedList<>(userList);
        System.out.println("LinkedList: ");
        System.out.println(userService.findUserByName(userList2, "Petya"));
        System.out.println(userService.findUserBySex(userList2, SEX.MALE));
        System.out.println(userService.sortUserListByAge(userList2));

        Set<User> userSet2 = new TreeSet<>(userList);
        System.out.println("TreeSet: ");
        System.out.println(userService.findUserByName(userSet2, "Katya"));
        System.out.println(userService.findUserBySex(userSet2, SEX.FEMALE));
        System.out.println(userService.sortUserListByAge(userSet2));

    }
}

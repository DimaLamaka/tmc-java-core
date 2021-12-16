package by.lamaka.lesson10.task1;


import by.lamaka.lesson10.task1.service.SerializationService;
import by.lamaka.lesson10.task1.service.SerializationServiceImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User(Sex.MALE, "Petya", 18);
        User user1 = new User(Sex.FEMALE, "Katya", 21);
        User user2 = new User(Sex.FEMALE, "Elena", 23);
        List<User> users = Arrays.asList(user, user1, user2);
        SerializationService<List<User>> serializationService = new SerializationServiceImpl();

        serializationService.serialization(users);
        List<User> userList = serializationService.deserialization();
        if (userList != null) {
            System.out.println(userList);
        }

    }
}

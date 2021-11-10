package by.lamaka.lesson4.task3;

public class UserTest {
    /*Создать класс User для хранения о обработки данных о пользователе.
    Создать поля для хранения имени и фамилии, возраста и пола (использовать enum). Создать методы для:
    Возврата имени и фамилии полностью
    Увеличения возраста
    Вывода общей информации о пользователе*/

    public static void main(String[] args) {
        User user1 = new User("Petr", "Petrov", User.Sex.MALE, 18);
        System.out.println(user1.getNameAndSurname() + " " + user1.getAge());
        user1.addAge(10);
        System.out.println("Add age : " + user1.getNameAndSurname() + " " + user1.getAge());
        System.out.println("All info: " + user1.toString());

        User user2 = new User("Elena", "Ivanova", User.Sex.FEMALE, 20);
        System.out.println(user2.getNameAndSurname() + " " + user2.getAge());
        user2.addAge(7);
        System.out.println("Add age : " + user2.getNameAndSurname() + " " + user2.getAge());
        System.out.println("All info: " + user2.toString());

    }

}

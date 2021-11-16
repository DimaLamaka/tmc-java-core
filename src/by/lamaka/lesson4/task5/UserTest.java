package by.lamaka.lesson4.task5;

public class UserTest {
    /*Сделайте класс с несколькими перегруженными методами. Создайте экземпляр класса
    и вызовите все созданные методы, передав им необходимые параметры.
    Что произойдет если методы будут иметь одинаковое имя, одинаковый параметры, но разный возвращаемый тип?

    Для класс User создайте внутренний класс для сохранения сведений об адресе.
    Попробуйте добавить сведения об адресе в общую информацию об пользователе.
    Адрес должен содержать страну и город проживания пользователя.*/

    public static void main(String[] args) {
        User user = new User(1, "Vasya", 23, new User.Address("Belarus", "Minsk"));
        System.out.println(user.toString());
        user.editUser(4);
        System.out.println(user.toString());
        user.editUser(3, "egor", 15);
        System.out.println(user.toString());
    }
}

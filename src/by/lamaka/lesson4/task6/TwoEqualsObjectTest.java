package by.lamaka.lesson4.task6;

import by.lamaka.lesson4.task3.User;

public class TwoEqualsObjectTest {
    /*Создайте два одинаковый имени класса в разный пакетах.
    В одном и том же методы попытайтесь создать экземпляры обеих классов.*/
    public static void main(String[] args) {
        User user = new User();//task3.User
        //User user1 = new User(); task3.User
        by.lamaka.lesson4.task5.User user1 = new by.lamaka.lesson4.task5.User(); //task5.User
    }
}

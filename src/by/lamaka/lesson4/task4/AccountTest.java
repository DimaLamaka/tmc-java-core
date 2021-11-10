package by.lamaka.lesson4.task4;

public class AccountTest {
    /*Создать класс содержащий несколько конструкторов.
    Создать объект этого класса, использовав один из них.
    В этом конструкторе сделать вызов другого конструктора этого же класса.

    Отметьте метод как @Deprecated. Попробуйте на экземпляре класса вызвать этот метод.
    Что подскажет idea при таком вызове.*/

    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.toString());
        System.out.println(account.getInfo()); //deprecated method

    }

}

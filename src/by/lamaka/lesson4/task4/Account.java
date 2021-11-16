package by.lamaka.lesson4.task4;

public class Account {
    private long id;
    private String name;
    private String surname;
    private int age;

    public Account() {
        this(0, "Ivan", "Ivanov", 18);

    }

    public Account(long id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Deprecated
    public String getInfo() {
        return id + " " + name + " " + surname + " " + age;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

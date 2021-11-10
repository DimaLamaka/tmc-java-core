package by.lamaka.lesson4.task3;

import java.util.Objects;

public class User {
    private String name;
    private String surname;
    private Sex sex;
    private int age;

    public User() {
    }

    public User(String name, String surname, Sex sex, int age) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
    }

    public enum Sex {
        MALE, FEMALE
    }

    public String getNameAndSurname() {
        return this.surname + " " + this.name;
    }

    public void addAge(int value) {
        if (value > 0) {
            this.age += value;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && sex == user.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, sex, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}

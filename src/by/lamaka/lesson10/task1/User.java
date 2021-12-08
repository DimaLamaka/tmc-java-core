package by.lamaka.lesson10.task1;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private Sex sex;
    private String name;
    private int age;

    public User() {
    }

    public User(Sex sex, String name, int age) {
        this.sex = sex;
        this.name = name;
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return age == user.age && sex == user.sex && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sex, name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "sex=" + sex +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

enum Sex {
    MALE, FEMALE
}

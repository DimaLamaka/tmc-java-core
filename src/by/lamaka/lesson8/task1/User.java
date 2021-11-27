package by.lamaka.lesson8.task1;

import java.util.Objects;

public class User implements Comparable {
    private String name;
    private int age;
    private SEX sex;

    public User() {
    }

    public User(String name, int age, SEX sex) {
        this.name = name;
        this.age = age;
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

    public SEX getSex() {
        return sex;
    }

    public void setSex(SEX sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && sex == user.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    @Override
    public int compareTo(Object o) {
        User user = (User) o;
        int result = this.getAge() - user.getAge();
        if (result == 0) {
            result = String.valueOf(this.getName().charAt(0)).compareTo(String.valueOf(user.getName().charAt(0)));
        }
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

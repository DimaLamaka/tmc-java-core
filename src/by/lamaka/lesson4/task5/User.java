package by.lamaka.lesson4.task5;

public class User {
    private int id;
    private String name;
    private int age;
    private Address address;

    public User() {
    }

    public User(int id, String name, int age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void editUser(int id) {
        this.id = id;
    }

    public void editUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void editUser(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void editUser(int id, String name, int age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /*public String editUser(int id, String name, int age, Address address) { // Должен быть одинаковый возвращаемый тип
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        return this.toString();
    }*/


    public static class Address {
        private String country;
        private String city;

        public Address(String country, String city) {
            this.country = country;
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address.getCountry() + " " + address.getCity() +
                '}';
    }
}

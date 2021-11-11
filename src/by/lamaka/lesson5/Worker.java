package by.lamaka.lesson5;

public class Worker extends Employee {
    public Worker() {
    }

    public Worker(String name, String surname, POSTS post, double workExperience) {
        super(name, surname, post, workExperience);
    }

    public POSTS getPost() {
        return POSTS.WORKER;
    }

    @Override
    public String toString() {
        return "Worker{ " + super.toString() + " }";
    }
}

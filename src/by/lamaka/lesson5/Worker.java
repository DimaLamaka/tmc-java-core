package by.lamaka.lesson5;

public class Worker extends Employee {
    public Worker() {
    }

    public Worker(String name, String surname, double workExperience) {
        super(name, surname, workExperience);
        this.setPost(this.getPost());
    }

    public POSTS getPost() {
        return POSTS.WORKER;
    }

    @Override
    public String toString() {
        return "Worker{ " + super.toString() + " }";
    }
}

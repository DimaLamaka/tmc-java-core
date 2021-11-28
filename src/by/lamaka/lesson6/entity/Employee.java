package by.lamaka.lesson6.entity;

public abstract class Employee extends Person {
    private final static int DEFAULT_RATE = 19999;
    private POSTS post;
    private double workExperience;

    public Employee() {
    }

    public Employee(String name, String surname, double workExperience) {
        super(name, surname);
        this.workExperience = workExperience;
    }

    public abstract POSTS getPost();

    public void setPost(POSTS post) {
        this.post = post;
    }

    public double getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(double workExperience) {
        this.workExperience = workExperience;
    }

    public int getDEFAULT_RATE() {
        return DEFAULT_RATE;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "post=" + post +
                ", workExperience=" + workExperience +
                "} " + super.toString();
    }
}

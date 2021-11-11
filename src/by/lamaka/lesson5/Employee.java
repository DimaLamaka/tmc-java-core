package by.lamaka.lesson5;

public abstract class Employee extends Person {
    private final static int DEFAULT_RATE = 19999;
    private POSTS post;
    private double workExperience;

    public Employee() {
    }

    public Employee(String name, String surname, POSTS post, double workExperience) {
        super(name, surname);
        this.post = post;
        this.workExperience = workExperience;
    }

    public double calculateSalary() {
        return DEFAULT_RATE * post.getPayRate() * this.getWorkExperience();
    }

    public abstract POSTS getPost();

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
        return super.toString() + "; Post: " + this.getPost() + "; Work experience: " + this.getWorkExperience() +
                " ; Salary: " + this.calculateSalary() + "$ ;";
    }
}

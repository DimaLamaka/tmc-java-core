package by.lamaka.lesson5;

public enum POSTS {
    WORKER(1),DIRECTOR(2);

    private int payRate;

    POSTS(int payRate) {
        this.payRate = payRate;
    }

    public int getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }
}

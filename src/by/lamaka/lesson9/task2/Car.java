package by.lamaka.lesson9.task2;

import java.util.Objects;

public class Car {
    private String model;
    private boolean isBenzine;
    private int yearOfProduction;

    public Car() {
    }

    public Car(String model, boolean isBenzine, int yearOfProduction) {
        this.model = model;
        this.isBenzine = isBenzine;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isBenzine() {
        return isBenzine;
    }

    public void setBenzine(boolean benzine) {
        isBenzine = benzine;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return isBenzine == car.isBenzine && yearOfProduction == car.yearOfProduction && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, isBenzine, yearOfProduction);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", isBenzine=" + isBenzine +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}

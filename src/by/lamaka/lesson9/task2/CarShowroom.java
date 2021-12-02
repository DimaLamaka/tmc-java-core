package by.lamaka.lesson9.task2;

import java.util.List;
import java.util.Objects;

public class CarShowroom {
    private String name;
    private int profit;
    private List<Car> cars;

    public CarShowroom() {
    }

    public CarShowroom(String name, int profit, List<Car> cars) {
        this.name = name;
        this.profit = profit;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarShowroom that = (CarShowroom) o;
        return profit == that.profit && Objects.equals(name, that.name) && Objects.equals(cars, that.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, profit, cars);
    }

    @Override
    public String toString() {
        return "CarShowroom{" +
                "name='" + name + '\'' +
                ", profit=" + profit +
                ", cars=" + cars +
                '}';
    }
}

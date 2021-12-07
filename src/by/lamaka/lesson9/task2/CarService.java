package by.lamaka.lesson9.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarService {
    public static void main(String[] args) {
        CarShowroom audi = new CarShowroom("audi", 1200000, Arrays.asList(
                new Car("q4 e-tron", false, 2020),
                new Car("a8", true, 2015),
                new Car("a4", true, 2010),
                new Car("a6", false, 2018)
        ));
        CarShowroom bwm = new CarShowroom("bmw", 120000, Arrays.asList(
                new Car("m4", true, 2016),
                new Car("x5", false, 2014),
                new Car("z4", true, 2017)
        ));
        CarShowroom skoda = new CarShowroom("skoda", 950000, Arrays.asList(
                new Car("octavia", false, 2020),
                new Car("octavia rs", false, 2021),
                new Car("rapid", true, 2016),
                new Car("codiaq", false, 2019),
                new Car("fabia", true, 2013)
        ));
        List<CarShowroom> carShowrooms = Arrays.asList(audi, bwm, skoda);

        System.out.println("All cars with \"4\" in model : ");
        carShowrooms.stream()
                .flatMap(carSR -> carSR.getCars().stream())
                .filter(car -> car.getModel().contains("4"))
                .forEach(System.out::println);

        System.out.println("All car showrooms, where there are more than 3 cars : ");
        carShowrooms.stream()
                .filter(carSR -> carSR.getCars().size() > 3)
                .forEach(System.out::println);

        System.out.println("Model cars in UPPER case: ");
        carShowrooms.stream()
                .flatMap(carSR -> carSR.getCars().stream())
                .map(Car::getModel)
                .forEach(model -> System.out.print(model.toUpperCase() + " "));

        int countAllCars = carShowrooms.stream()
                .mapToInt(carSR -> carSR.getCars().size())
                .sum();
        System.out.println("\nCount all cars : " + countAllCars);

        System.out.println("Map by name and count cars: ");
        Map<String, Integer> nameAndCountCars = carShowrooms.stream()
                .collect(Collectors.toMap(CarShowroom::getName, carSR -> carSR.getCars().size()));
        nameAndCountCars.forEach((name, count) -> System.out.println(name + " " + count));

    }
}

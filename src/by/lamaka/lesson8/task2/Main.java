package by.lamaka.lesson8.task2;

import by.lamaka.lesson8.task2.service.NumberService;
import by.lamaka.lesson8.task2.service.NumberServiceImpl;

public class Main {
    public static void main(String[] args) {
        NumberService numberService = new NumberServiceImpl();
        int[] numbers = new int[]{7, 1, 3, 5, 3, 0, 242, 7, 9, 10, 1, 3, 2, 11, 242};
        System.out.println(numberService.createMapCountOfOccurNumbs(numbers));
    }
}

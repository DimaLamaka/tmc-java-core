package by.lamaka.lesson9.task1;


import java.util.Arrays;

public class ArrayService {
    public static void main(String[] args) {
        int[] array = new int[]{1, 19, 25, 22, 34, -82, -15, 23, 0, -2, -89, 101, 33, 0, 1, -29, 112};
        System.out.println("Array : " + Arrays.toString(array));

        int max = Arrays.stream(array)
                .max()
                .getAsInt();
        System.out.println("Max elem is : " + max);

        int sumPosNumbers = Arrays.stream(array)
                .filter(el -> el % 2 == 0)
                .sum();
        System.out.println("Sum positive numbers : " + sumPosNumbers);

        System.out.print("All numbers after 5 element: ");
        Arrays.stream(array)
                .skip(4)
                .forEach(el -> System.out.print(el + " "));
    }

}

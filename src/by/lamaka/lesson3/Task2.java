package by.lamaka.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    /* В произвольном массиве найти сумму минимального и максимального элементов.*/

    public static void main(String[] args) {
        int[] array = new int[10];
        initArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Sum max value and min value = " + sumMinAndMaxElem(array));

    }

    private static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }
    }

    private static int sumMinAndMaxElem(int[] array) {
        int sum = 0;
        int minElem = array[0];
        int maxElem = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minElem) {
                minElem = array[i];
            }
            if (array[i] > maxElem) {
                maxElem = array[i];
            }
        }
        sum = minElem + maxElem;
        return sum;
    }
}

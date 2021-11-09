package by.lamaka.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    /*Создать массив на n-элементов и заполнить его числами фиббоначи.*/

    public static void main(String[] args) {
        int countOfNumbers = new Random().nextInt(100) + 1;
        System.out.println(Arrays.toString(createArrayFibbonachi(countOfNumbers)));

    }

    private static long[] createArrayFibbonachi(int countOfNumbs) {
        long[] array = new long[countOfNumbs];

        if (array.length > 1) {
            array[0] = 0;
            array[1] = 1;
        } else {
            array[0] = 0;
            return array;
        }
        if (array.length > 2) {
            for (int i = 2; i < countOfNumbs; i++) {
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        return array;
    }
}

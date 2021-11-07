package by.lamaka.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    /*В произвольном числовом массиве найти число, которое встречается чаще всего.
    Вывести это число и количество раз, сколько число встречается
    (если несколько чисел встречаются одинаковое количество раз – вывести любое из них).*/

    public static void main(String[] args) {
        int[] array = new int[20];
        initArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(findFrequentNumber(array));

    }

    private static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    private static String findFrequentNumber(int[] array) {
        int[][] table = new int[2][array.length];
        table[0] = Arrays.copyOf(array, array.length);
        int nextValue = 0;
        int resNumber = 0;
        int resFreqCount = 0;

        for (int i = 0; i < table[1].length; i++) {
            nextValue = table[0][i];
            for (int j = i; j < table[0].length; j++) {
                if (nextValue == table[0][j]) {
                    table[1][i]++;
                }
            }
            if (resFreqCount < table[1][i]) {
                resFreqCount = table[1][i];
                resNumber = table[0][i];
            }

        }
        String result = "Number: " + resNumber + " Number frequency: " + resFreqCount;
        return result;
    }

}


package by.lamaka.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    /*Найти разницу между суммой элементов стоящих на четных и нечетных местах.*/

    public static void main(String[] args) {
        int[] array = new int[10];
        initArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(sumNegPosAndPositivePos(array));

    }

    private static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }
    }

    private static String sumNegPosAndPositivePos(int[] array) {
        String result = "";
        int sumNumbsNegPos = 0;
        int sumNumbsPositivePos = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumNumbsPositivePos += array[i];
            } else {
                sumNumbsNegPos += array[i];
            }
        }
        result = "Sum numbers by negative position = " + sumNumbsNegPos + "\nSum numbers by positive position = " + sumNumbsPositivePos +
                "\nDifference between sums = " + Math.abs(sumNumbsNegPos - sumNumbsPositivePos);
        return result;
    }
}

